# Intent

---
##什么是Intent？##


##Intent有什么作用##
连接各个组件

 1. 用来激活启动其他应用程序组件
 2. 作为传递数据的桥梁

##Intent的七大属性##

 1. ComponentName 组件名称 目标组件的全类名
 > setComponent()
>setClass()
>setClassName()
>getComponent

 2. Ation
 >普通的字符串
>表示Intent将要执行动作的描述
>setAction()
>getAction()

 3. Data
 >用于向Action属性提供操作的数据
>URL对象 scheme://host:port/path
>协议头，主机，端口，路径
 4. Type
 >对Data进行描述
>当data为null时，才有效
>指定Data所指丁的Uri对应的MIME类型
>不指定会根据数据自动推导

 5. Category
 >字符串 为Action提供额外的附件类别信息
>可以有多个Category

 6. Extra
 >用于多个Action之间的数据交换
>通过键值进行数据存储
>
>

 7. flags
 >标记组件如何启动
>以及启动后如何对待
>FLAG_ACTIVITY_SINGLE_TOP
>FLAG_ACTIVITY_CLEAR_TOP

