家庭记账
==

# 目标
* 模拟实现一个基于文本界面的《家庭记账软件》 
* 掌握初步的编程技巧和调试技巧
* 主要涉及以下知识点
    * 变量的定义
    * 基本数据类型的使用
    * 循环语句
    * 分支语句
    * 方法声明、调用和返回值的接收
    * 简单的屏幕输出格式控制
    
# 需求说明
* 模拟实现基于文本界面的《家庭记账软件》。
* 该软件能够记录家庭的收入、支出，并能够打印收支明细表。
* 项目采用分级菜单方式。主菜单如下：
```text
-----------------家庭收支记账软件-----------------
1 收支明细
2 登记收入
3 登记支出
4 显示余额
5 退 出
请选择(1-5)：
```


* 假设家庭起始的生活基本金为10000元。
* 每次登记收入（菜单2）后，收入的金额应累加到基本金上，并记
录本次收入明细，以便后续的查询。
* 每次登记支出（菜单3）后，支出的金额应从基本金中扣除，并记
录本次支出明细，以便后续的查询。
* 查询收支明细（ 菜单1）时，将显示所有的收入、支出名细列表

* “登记收入”的界面及操作过程如下所示：
```text
-----------------家庭收支记账软件-----------------
1 收支明细
2 登记收入
3 登记支出
4 显示余额
5 退 出
请选择(1-5)：2
本次收入金额：1000
本次收入说明：劳务费
```

* “登记支出”的界面及操作过程如下所示：
```text
-----------------家庭收支记账软件-----------------
1 收支明细
2 登记收入
3 登记支出
4 显示余额
5 退 出
请选择(1-5：3
本次支出金额：800
本次支出说明：物业费
```

* “收支明细”的界面及操作过程如下所示：
```text
-----------------家庭收支记账软件-----------------
1 收支明细
2 登记收入
3 登记支出
4 显示余额
5 退 出
请选择(1-5：1
-----------------当前收支明细记录-----------------
收支 账户金额 收支金额 说 明
收入 11000 1000 劳务费
支出 10200 800 物业费
--------------------------------------------------
```
* 提示：明细表格的对齐，可以简单使用制表符‘\t’来实现

* “退 出”的界面及操作过程如下所示：
```text
-----------------家庭收支记账软件-----------------
1 收支明细
2 登记收入
3 登记支出
4 显示余额
5 退 出
请选择(1-5：5
确认是否退出(Y/N)：

```

* 基本金和收支明细的记录
* 基本金的记录可以使用int类型的变量来实现：
int balance = 10000;
* 收支明细记录可以使用Sting类型的变量来实现，其初始值为明细表的表
头。例如：
String details = "收支\t账户金额\t收支金额\t说 明\n";
* 在登记收支时，将收支金额与balance相加或相减，收支记录直接串接到
details后面即可。

