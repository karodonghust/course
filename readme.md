#### what`s spring
1. spring是一个框架，核心技术是ioc，aop。实现解耦合
2. spring是一个容器，容器中存放的是java对象
#### how to use spring
1. 把项目中需要使用的对象放入到容器中
2. 让容器完成对象的创建，对象之间关系的管理
3. 从容器中获取需要使用的对象  
    * dao类，service类，controller类，工具类，应该放到容器中。
    * 实体类对象，servlet,listener,filter,这些对象不应该放到容器中。
    * spring中的对象，默认都是单例的，在容器中叫这个名称的对象只有一个
##### spring 项目实现步骤
1. 创建maven项目  
2. 加入maven的依赖：  
     * 加入spring依赖  
     * 加入junit依赖  
3. 创建类（接口和它的实现类  
4. 创建spring需要使用的配置文件  
    声明类的信息
5. 测试

#### spring 为javabean 属性赋值,经常改动用xml，不经常改动用注解
1. 使用xml文件实现  
2. 基础注解实现

#### 注入方式 xml方式  
1. set()注入
    ```
    <bean id="student" class="com.karo.xmlIoc.service.impl.StudentImpl">
          <property name="name" value="李四"/> <!--自动调用setName方法 -->
          <property name="age" value="20"/> <!-- 自动调用setAge方法 -->
           <property name="school" ref="mySchool"/>
    </bean>
    ```
2. 构造注入 
    * spring调用类的有参构造方法，在创建对象的同时，在构造方法中给属性赋值
    构造注入使用<construcor-arg> 
        * 构造方法形参名
        * index 表示构造方法的参数位置
        * value 构造方法的形参对象是简单类型的，使用value
        * ref 构造方法的形参对象是引用类型是，使用ref
    ```
        <bean id="mySchool" class="com.karo.xmlIoc.service.impl.SchoolImpl">
           <constructor-arg name="name" value="mySchool"/>
           <constructor-arg name="address" value="1037森林"/>
       </bean>
    ```  
3. 自动注入  
    对于引用类型，可以使用自动注入，简化配置，实现spring自动为引用类型赋值
    * byName 按照名称注入，属性名需要与被自动注入的bean的id保持一致  
    ```
        <bean id="student" class="com.karo.xmlIoc.service.impl.StudentImpl" autowire="byName">
           <property name="name" value="李四"/>
           <property name="age" value="20"/>
           <!--   <property name="classRoom" ref="myClassRoom"/>  
           <property name="school" ref="mySchool"/> -->
        </bean>
         <bean id="school" class="com.karo.xmlIoc.service.impl.SchoolImpl">
            <constructor-arg name="name" value="mySchool"/>
            <constructor-arg name="address" value="1037森林"/>
         </bean>
        
         <bean id="classRoom" class="com.karo.xmlIoc.service.impl.ClassRoomImpl">
            <property name="name" value="1406"/>
         </bean>
    ```
    * byType 属性的类型，与被自动注入的bean的class是同源关系
        > 同源关系  
        > 1. 完全一致  
        > 2. 引用类型和bean的class是父子关系
        > 3. 引用类型和bean的class接口与实现类的关系
    ```
        <bean id="student" class="com.karo.xmlIoc.service.impl.StudentImpl" autowire="byType">
            <property name="name" value="李四"/>
            <property name="age" value="20"/>
            <!--   <property name="classRoom" ref="myClassRoom"/>  
            <property name="school" ref="mySchool"/> -->
        </bean>
        <bean id="mySchool" class="com.karo.xmlIoc.service.impl.SchoolImpl">
            <constructor-arg name="name" value="mySchool"/>
            <constructor-arg name="address" value="1037森林"/>
        </bean>
        <bean id="myClassRoom" class="com.karo.xmlIoc.service.impl.ClassRoomImpl">
            <property name="name" value="1406"/>
        </bean>
    ```
4. 多配置文件
   ```
       <import resource="classpath:beans.xml"/>
       <import resource="classpath:beans1.xml"/>
   ---
   ; , 空格 均可
       <import resource="classpath:beans.xml;beans1.xml"/>
   ```
#### 注入方式 注解方式  
* 加入maven的依赖：spring-context,此时会简介加入spring-aop依赖
* 在类中加入spring的注解
* 在spring配置文件中，加入一个组件扫描器的标签，说明注解在项目中的位置
* @Respotory,@Service,@Controller 三个注解的使用语法和@Component一样，都可以用来创建对象，
但是这三个注解还有额外的功能，可以用来为项目实现分层
1. @Component  
    * 用于创建对象，等同于<bean>的功能  
    * 属性value 对应bean的id的值，value的值是唯一的  
    * 位置在类的上面
    ```
        <!-- 组件扫描器，组件就是java对象
        component-scan 工作方式：扫描遍历base-package指定的包，扫描包和子包中的所有的类，
        找到类中的注解，按照注解的功能创建对象，或给对象的属性赋值。
        <context:component-scan base-package="com.karo.anno"/>
        @Component(value="beanid") or @Component("beanId) 
        or @Component 此时，spring自动创建id，类名首字母小写
    ```
2. @Respotory（用在持久层类的上面）
    放在dao的实现类上面，表示创建dao对象，dao对象是能访问数据库的
3. @Service（用在业务层类的上面）
    放在service的实现类上面，创建service对象，service对象是做业务处理的，可以有事物等功能
4. @Controller（用在控制器层面的）
    放在控制器类的上面，创建控制器对象，就够接收用户提交的参数，显示请求的处理结果
5. @Value  
    为基本类型的属性赋值
    * 在属性定义之上添加，无需set方法
    * 在set方法之上定义
    ```
        @Value("张飞")
        private String name;
        @Value("11")
        private int age;
    ---
     @Value("张飞")
     public void setAge(int age) {
         this.age = age;
     }
    ```
6. @AutoWired  
    为应用类型赋值，通过该注解，自动注入实现为类的属性赋值，支持byName,byType 
    * 默认使用byType自动注入  
    * 在属性之上使用
    * 在set方法之上使用
    * 属性required， 是一个boolean类型的，
    > * 默认为true：表示引用类型赋值失败，程序报错，并终止执行 <!-- 推荐使用 -->
    > * 属性为false：表示引用类型赋值失败，程序不报错，不会中止执行 
    ```
    <!-- byType -->
        @Autowired
   	    private School school;
    <!-- byName -->
        @AutoWired()
        @Qualifier(value = "mySchool")
        private School school;
    ```
7. @Resource
    来自jdk中的注解，spring框架提供了对这个注解的功能支持，可以使用台给引用类型赋值
    使用的也是自动注入原理，支持byName,byType, 默认是byName,如果byName失败，再使用byType
    * 在属性定义之上
    * 在set方法之上
    ```
        @Resource
        private School school; 
    <!-- 只使用byName -->
        @Resource(name = "mySchool")
    	private School school;
    ```

---
#### junit使用
1. 引入junit依赖
2. 创建测试类：src/test/java
3. 创建测试方法  
>* public 方法
>* 没有返回值void
>* 方法没有参数
>* 方法的上面加入@Test，这样的方法是可以单独执行的，不需要使用main方法。  

#### AOP  
1. 切面，给目标类增加的功能，就是切面。日志，事务管理功能等  
    > * 切面的特点：一般是非业务的，独立使用的。  
2. 连接点： 链接业务方法和切面的位置。某类中的业务方法  
3. 切入点：指多个连接点方法的集合，多个方法
4. 通知：  表示切面功能执行的时间  
    > * 切面在连接点方法之前还是之后执行  

#### AspectJ
1. 切面执行的时机，在规范中叫做通知
    > * @Before
    > * @AfterReturning  
    >>  ```
    >> /**
    >> 自定义变量名必须和通知方法的形参名保持一致
    >> 能够获取到目标方法的返回值，可以根据这个返回值做不同的处理功能
    >> 可以修改返回值(修改String会失效)
    >> */
    >> @AfterReturning(value = "execution(* *..*Service*.returnTest(..))",returning="res")
    >> public void myAfterReturning(Object ret){
    >> }
    >> `````
    > * @Around
    > * @AfterThrowing
    > * @After
2. 切入点
    > * 切入点表达式：execution(访问权限，方法返回值，方法生命（参数），异常类型)
    > * \* 0至多个任意字符
    > * .. 用在方法参数中表示任意多个参数，用在包名后，表示当前包及其子路径包
    > * \+ 用在类名后，表示当前类及其子类,用在接口后，表示当前接口及其实现类
    > ```
    > execution(public * *(..)) <!-- 指定切入点为：任意公共方法-->
    > execution(* set*(..)) <!-- 指定切入点：任何一个以"set"开始的方法 -->
    > execution(* com.xyz.service.*.*(..)) <!-- 定义在service包里的任意类的任意方法。
    > execution(* com.xyz.service..*.*(..)) <!-- 指定切入点：定义在service包或者子包里的任意类的任意方法 -->
    > execution(* *..service.*.*(..)) <!-- 指定切入点：所有包下的service子包下所有类的任意方法 -->
    > /**
    >   ".."出现在类名中时，后面必须跟*，表示，包，子包下的所有类
    > */
    > ```