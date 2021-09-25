# Spring-MVC-Hello-World-Eclipse
<h2> prerequisites </h2>

<ul>
  <li>Java 11</li>
  <li>Eclipse ide Version: 2021-09 (4.21.0) </li>
  <li>Tomcat 8.5 </li>
</ul>
<h3>Steps fro creating Spring MVC hello World!</h3>

<p> 1) go to new -> project -> Maven Project and click on next</p>

![hello_00](pictures/hello_01.png)
<p>2)You will see bwlow screen, agan click on next</p>

![hello_00](pictures/hello_01.png)
<p>3) We need to select type of archetype here. As we are creating web app here, put following text in filter maven-archetype-webapp </p>

![hello_02](pictures/hello_02.png)
<p>4) We need to put group id and artifact id here.</p>

![hello_03](pictures/hello_03.png)

<p>
when you follow above steps, ypur project structure will look like below: </p>

![hola_04](pictures/hello_04.png)
<p>As you can see, we are getting an error (“The superclass “javax.servlet.http.HttpServlet” was found in java build path”) in index.jsp.
To solve this issue, follow below steps:  </p>
<p> You need to set target run time as Apache Tomcat. To do that, right click on project -> properties -> target runtimes. </p>

![hello_05](pictures/hello_05.png)
<h3>Adding Spring MVC dependency.</h3>
<p>Add spring dependency in pom.xml. We require spring core and spring mvc dependency here.</p>

![hello_06](pictures/hello_06.png)
<h3>Create controller and view</h3>
<p>Create a package named "albertoangel.muqui.controller"</p>
<p>createa a controller class named "HelloController"</p>

![hello_07](pictures/hello_07.png)
<p>Modify index.jsp as below</p>

![hello_08](pictures/hello_08.png)
<p>Create hello.jsp in  /WEB-INF/ folder</p>

![hello_08](pictures/hello_09.png)
<p>Configuring spring MVC application</p>
<p>We need to configurate two files  "web.xml" and "springmvc-dispatcher-servlet.xml". </p>

![hello_10](pictures/hello_10.png)
<p>create xml file named “springmvc-dispatcher-servlet.xml” in /WEB-INF folder as below.</p>

![hello_11](pictures/hello_11.png)

<p> We do maven  built</p>
<p> Right click on project -> Run as -> Maven build </p>

![hello_12](pictures/hello_12.png)
<h3>Run the application</h3>
<p>Right click on project -> run as -> run on server</p>
<p>Select apache tomcat and click on finish</p>

![hello_13](pictures/hello_13.png)
<h3>You will see below screen:</h3>

![hello_14](pictures/hello_14.png)
<p>When you click on above link, you will get below screen</p>

![hello_15](pictures/hello_15.png)









