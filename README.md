# Geographic-Information-System_Software-Engineering

1. Requirement specification

What is the GIS? 
A geographic information system (GIS) is a framework for gathering, managing, and analyzing data. Rooted in the science of geography, GIS integrates many types of data.With this unique capability, GIS reveals deeper insights into data, such as patterns, relationships, and situations—helping users make smarter decisions. We can order some of the areas of usage of GIS like below;
GIS in Mapping, Transportation Planning, Urban Planning, Natural Resources Management, Tourism Information System, Energy Use Tracking and Planning etc. These various usage areas show us we across with GIS in real life more than we expected.

How did adapt my GIS?

The GIS has a huge area of usage. For example, even if you want a order meal on internet the web site or the app your using should use GIS. So that reason GIS is in all part of our life’s. For that reason, I decide I should handle my project subject so basically but it should involve the crux of the my project topic. So that reason I had decide my system should include a user object, an analysist object, a database object, a data object, and a map object.

Object Functionalities 

1.	User Object Functionality
•	The user is the main object of our system. In this project user can two different operations. One of them these operations is creating a map. During this operation user send many data about the map which the user wants the create on my system. The user should choose an area for the local maps also the user should choose his map type and if user has his own data, he should enter these data on the system. His job is done here. Now system’s turn.
2.	System Object Functionality
•	In my project has a system object. This system is responsible about login operation and accepting users’ requests. Also, system is a layer between analysts and user. System takes user inputs and check its fullness and after that send these inputs analysts.
3.	Analysts Object Functionality
•	In my project analysts object is responsible to analyzing user inputs. Analysts check user inputs’ fitness value after that he could make analysis on these data. After the finishing, these operations analysts creates a map for user.
4.	Database Object Functionality
•	Database Object is responsible to keeping our data and maps. And also we can export our maps three different file format like real GIS such as shx or shp.

2. Use case diagram 

![SoftwareEngineering-Page-4](https://user-images.githubusercontent.com/41449476/166920091-e87ad9f1-f085-4fd1-a437-6e1ffe7888cf.png)


•	In this part of my project, I create a Use Case diagram. In this use case diagram, I try to show my system’s functionality. Our user has two main process One of them these processes is creating a map. User has to login on my system before the creating map. So that reason I use include relationship between these two cases. User’s create map request has to accept by the system and again I use the include relationship. After these operations Analysts takes user inputs and make some analyses on these inputs and analysts creates a map for user. If user set his map properties savable System can save this map on database. So that reason I use extend relationship on this point. 

•	The other process is search a map. In this action user can set some filters about map that is searching by user. But this is an optional thing in my system. Even if user do not apply a filter on that map system will show a basic world map to user. So that reason  I use extends relationship at this point.
3. Activity diagram

![SoftwareEngineering-Page-3 (2)](https://user-images.githubusercontent.com/41449476/166920044-479d7e83-1b1a-4fdf-b33f-4237f48322dc.png)



In this part of project, I make an Activity Diagram. And this diagram shows us a user’s login on the system to end of his operations. First of all, he joins the system and he choose his operation. If he chooses to create a map, he must enter some inputs and sends these inputs to system. System accept this request and it sends to analysts. Analysts check data fitness and make some analysis and creates a map. After that he send to system this map if user want to save this map on database system saves. If user choose to search a map, he should enter some filters and system search in database matched map with these filters. If he finds he shows to user. If he does not find any map, he sends a message to user.






4. Class diagram


![SoftwareEngineering-Page-2](https://user-images.githubusercontent.com/41449476/166920017-712c14d2-e17b-42ec-8fd3-7e7767f475c9.png)


 
5. Use three of the patterns in your class design using at least one creational, structural, and behavioral in an integrated way. 

1.	Creational Pattern:
•	Factory Pattern:
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. I use factory pattern in my project as a creational pattern. Maps are including more than one layers. Mainly we have 2 types layer feature based and pixel based. And this type of layers is upper type other different layers. I use factory pattern on creation step. We can create our layers via layerFactory class.

2.	Structural pattern:
•	Facade Pattern:
I used Facade pattern in my project as a creational pattern. Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes. In my project I have more than one data types like point data, line data or polygon data. Line data occurs by point data combination. Also, polygon data occur by line data combinations. So that reason we have complex structure at this point. I decide this complex structure get simpler for my analyst. At this point I decide use Façade pattern. Via this pattern our analyst does not know any point data class or line data class and he never create any point or line object. At this point we have a Facade class. Via this class the analyst can convert any point or line or polygon data.

3.	Behavioral Pattern:
•	Strategy Pattern:
Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable. In my system user can get his map 3 different file formats. So that reason I decide use strategy pattern at this point. Because we have one operation, but we can this operation three different ways. During the application of this pattern I defined a interface for setting my saving strategy. 3 different class implements this interface and they have same method but theirs return types are different. They are return three different file format on theirs function. Also for this point I defined an interface called getFile. And 3 different class implements this interface. I define these classes and these structure for using strategy pattern classes return types.

 
6. Code one of the pattern according to your assignment.

Facade Pattern implementation in Java.

•	MyPoint.java


![resim](https://user-images.githubusercontent.com/41449476/166919561-eeaf2d92-eb63-47c4-8108-95bed83f30ec.png)











•	MyLine.java



![resim](https://user-images.githubusercontent.com/41449476/166919577-5bce5e45-86ed-437b-a3d3-1afd6e488423.png)





















•	MyPolygon.java


![resim](https://user-images.githubusercontent.com/41449476/166919586-7fec93e6-1f5e-42fe-ad9d-62e229dff37d.png)


















•	FacadeForFeature.java


![resim](https://user-images.githubusercontent.com/41449476/166919605-4134f5e3-c26d-4d5f-a21d-b501152ccd02.png)













•	Test.java and program output

![resim](https://user-images.githubusercontent.com/41449476/166919650-cfa28479-d855-4393-9c79-352e65400a3b.png)

