# JSON & GSON

---

什么是JSON
:    JSON是一种与开发语言无关的、轻量级的**数据格式**。全称是JavaScript Object Notation，起源于JavaScript，后逐渐出现在各个平台

优点

- 易于人的阅读各编写，易于程序解析与生产

---

- 数据结构
    - Object：使用花括号{}包含键值对结构，key必须是string类型，value为任何基本类型或数据结构
    - Array：使用中括号[]来起始，并用逗号，来分割元素
    
- 基本数据类型
    - string
    - number
    - true
    - false
    - null
---

- 生成JSON对象
    - 原生JSON对象然后put
    - 使用Map构造JSON对象
    - 使用Java Bean构造对象
    
---

Gson:GSON是Google提供的用来在Java对象和JSON数据之间进行映射的Java类库。可以将一个Json字符转成一个Java对象，或者将一个Java转化为Json字符串。

