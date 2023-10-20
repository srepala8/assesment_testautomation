# assesment_testautomation
Web and Api Tests 

                     ############STEPS #############


# on your machine all setups done properly:
Like Eclipse IDE, Maven, Java jdk and set path variables etc..

# Importing the project into your machine by using the below command in cmd

git clone "Repo Url"


# open the project in Eclipse IDE

# Go to com.absa.base package and open Constant.java class and change the locations of paths according to your project location
--> API_PROPERTY_FILE_PATH
--> REPORT_PATH
--> REPORT_FILE_NAME_PATH

# Next Go to TestBase.java class on the same package and change the location of path for config.properties file on fileinputsteream step.
 
# Next Go to com.absa.utils package and open the TestUtil.java class and change the location of Data sheet according to your machine
-->TESTDATA_SHEET_PATH 
# Next Go to the com.absa.listeners package which exist in the src/test/java folder and change the locations for screen shots in the ScreenshotBase.java class.

That's it...Now everthing in order.

# Now just goto testng.xml file and Run as-->TestNG Suite..Then the tests will run.You may see the results there.

# next just refresh the project and just see the reports on test-output folder by clicking index.html file. else you may see on Reporting folder where the api test results were present.


#########################Thank you#################################





