#Bridege 模式

__功能__：将类的功能层次结构和类的实现层次结构连接起来

+ 类的功能层次
>现有一个类Something，当我们想在这个类中新增新功能时，会编写一个Something的子类
，即SomethingGood类。   
>Something -> SomethingGood    
+ 类的实现层次
>当子类实现了父类AbstractClass类的抽象方法时，他们之间就构成了一个小小的层次结构。    
>AbstractClass -> ConcreteClass    
>这里类的层次结构并非用于增加功能，真正作用是帮助我们实现下面这样的人物分担。    
>>1. 父类通过声明抽象方法来定义接口    
>>2. 子类通过实现具体方法来实现接口

解析例子:https://www.cnblogs.com/WindSun/p/10260547.html

