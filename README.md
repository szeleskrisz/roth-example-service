# Instructions
- Fork the roth-example-service repo
- Clone and import the following project to an Eclipse workspace: https://github.com/aptexx/aptexx-test.git
- Create a new database in MYSQL on localhost called aptexxtest (if your database connection parameters are different, you can change them in the Db.java file)
- Run the seed.sql file in the docs directory against this new database
- Create a new run configuration (Java application) called aptexx-test-server, use roth.lib.java.service.server.ServiceServer as the main class
- Run the service server using the run config you just created
- Run the main() in aptexx.test/Test.java to ensure that the project is running properly

Review the existing sample code and any relevant framework code. You should be able to explain what's going on in the sample.

Tasks
- Extend the database model to add some additional tables with foreign key relationships to the person table
- Seed the data in your new tables as appropriate
- Write the java model and table classes for these database tables using the same conventions as found in the Person and PersonTable classes
- Write service methods on the TestService.java class to show that you can pull data from these models. When you create a new service method remember to create a new method on the TestClient.java class.
- Write service methods to create data into these models. Note there isn't an example of this, you should review the framework code to figure out how to do this.

You should be able to explain to us how you accomplished the above tasks, step through and debug your code, step through and debug dependency library source code (i.e. source code outside the scope of the project)

* IMPORTANT Make sure you are able to step through and understand the service() method in the roth.lib.java.service.endpoint.HttpEndpoint dependency class.
  You can do this by putting a breakpoint on the service method. All traffic is funnelled through this method.

SQL Tasks
- Based on the modeling you created, write an example of a query that aggregates data from the data tables. Generally the queries should use MYSQL functions like COUNT(), SUM(), and GROUP BY.

