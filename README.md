# day17_case
MVC三层架构小例子

# 6.案例：用户信息列表展示

 1. 需求：用户信息的增删改查操作
 2. 设计：
	- 技术选型：Servlet+JSP+MySQL+JDBCTempleat+Duird+BeanUtilS+tomcat
	- 数据库设计：
```sql
# 创建数据库
CREATE DATABASE day17;

# 使用数据库
USE day17;

# 创建表
CREATE TABLE USER(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20) NOT NULL,
	gender VARCHAR(5),
	age INT,
	address VARCHAR(32),
	qq VARCHAR(20),
	email VARCHAR(50)
);
```
