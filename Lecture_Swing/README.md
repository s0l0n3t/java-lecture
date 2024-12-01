# Employee Holiday Management System
This repository created under Java-Lecture repository. So this project includes learn on development. 
- Java 23
- Java swing library
- Mysql

### Needed
- JDK 23.0.1
- Swing framework
- Mariadb 10.4.32
- PHP 8.2.12

 [![Build Status](https://static.licdn.com/aero-v1/sc/h/aahlc8ivbnmk0t3eyz8as5gvr)](https://www.linkedin.com/in/furkan-tokgoz/) 

 ## Features
* There are 3 database table for projects. They are `user`, `employee`, `authority`. So there are 2 table view in projects.
* We can change priority without coding. Its avaible on `authority` database table.
* Advanced searching methods. You need to just write what you want to search in textbox.
* This project developed with `N Layered architecture`. Moreover standard developmend proccess applied.

<br>


<details>
<summary> Software Interface </summary>
<details style="margin-left: 20px;">
  <summary> Login page </summary>
  <h3> Login page </h3>

![github](https://raw.githubusercontent.com/s0l0n3t/java-lecture/refs/heads/main/Lecture_Swing/assets/loginPage.png)
</details>

<details style="margin-left: 20px;">
<summary> Registration page </summary>
<h3> Registration page </h3>

![github](https://raw.githubusercontent.com/s0l0n3t/java-lecture/refs/heads/main/Lecture_Swing/assets/registerPage.png)

* `Account type` includes `ADMIN`, `MANAGER`, `EMPLOYEE`. These are whole about management system rights like adding, modifying... vb.
</details>

<details style="margin-left: 20px;">
    <summary>Main page</summary>
  <h3> Main page </h3>

![github](https://raw.githubusercontent.com/s0l0n3t/java-lecture/refs/heads/main/Lecture_Swing/assets/mainPage.png)
* `asd` is username.
* `ADMIN` includes whole rights.
* There are 3 type in Employee table. 
</details>
<details style="margin-left: 20px;">
  <h3> Search button page </h3>
<summary> Search button page </summary>

![github](https://raw.githubusercontent.com/s0l0n3t/java-lecture/refs/heads/main/Lecture_Swing/assets/mainSearchButtonPage.png)
</details>

<details style="margin-left: 20px;">
<summary>Add button page</summary>
<h3> Add button page </h3>

![github](https://raw.githubusercontent.com/s0l0n3t/java-lecture/refs/heads/main/Lecture_Swing/assets/mainAddButtonPage.png)

* This register form page includes employee adding function to mysql `employee` table.

* Registration form page includes `Employee types`. They are `type1`,`type2`,`type3`. these are connected with holiday days calculation.
</details>
</details>

<details>
<summary>  Database Tables </summary>

<details style="margin-left: 20px;">

<summary>User table schema </summary>
<h3> User table schema </h3>
<br>

![github](https://raw.githubusercontent.com/s0l0n3t/java-lecture/refs/heads/main/Lecture_Swing/assets/database/userTableSchema.png)

* `user` Table includes login page accounts.
</details>


<details style="margin-left: 20px;">
<summary>Employee table schema </summary>
<h3> Employee table schema </h3>
<br>

![github](https://raw.githubusercontent.com/s0l0n3t/java-lecture/refs/heads/main/Lecture_Swing/assets/database/employeeTableSchema.png)

* `employee` Table includes employees on main page.
</details>


<details style="margin-left: 20px;">
<summary>Authority table schema </summary>
<h3> Authority table schema </h3>
<br>

![github](https://raw.githubusercontent.com/s0l0n3t/java-lecture/refs/heads/main/Lecture_Swing/assets/database/employeeTableSchema.png)

* `authority` Table includes user accounts' accessibility.
</details>
</details>


## License

[![CC0](https://licensebuttons.net/p/zero/1.0/88x31.png)](https://creativecommons.org/publicdomain/zero/1.0/)

To the extent possible under law, [Furkan TOKGÖZ](https://github.com/s0l0n3t) has waived all copyright and related or neighboring rights to this work.