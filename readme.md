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
---
#### spring 为javabean 属性赋值
1. 使用xml文件实现  
2. 基础注解实现
---
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


---
#### junit使用
1. 引入junit依赖
2. 创建测试类：src/test/java
3. 创建测试方法  
>* public 方法
>* 没有返回值void
>* 方法没有参数
>* 方法的上面加入@Test，这样的方法是可以单独执行的，不需要使用main方法。
 
 