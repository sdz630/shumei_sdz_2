# 树莓第二次考核作业

### ArraryList

#### 成员变量
核心是对象数组，还有数组长度和容量
```
private Object[] elementData;
private int size;
private static final int DEFAULT_CAPACITY=10;
```

#### 构造函数
1.默认构造容量为10的对象数组
2.指定容量大小构建数组

#### 方法
##### 1.add 方法
往数组里添加一个制定元素

##### 2.get、set方法
查找、替换

##### 3.checkindex()
用于其他方法的条件判断

##### 4.remove(index)
活用system.arrarycopy（）方法

##### 5.remove（element）
先判断，再调用remove（index）

##### 6.重写toString方法


### 泛型
在编译中起效果，可以看作多个类型，类似c++的模板

##### 使用
1.泛型类(可以继承）<br>
2.泛型接口（可以多继承）<br>
3.泛型方法<br>

