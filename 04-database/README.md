### How to test the database container
1. Run the command 
    ```
        podman exec -it mysql_container /bin/bash
    ```

2. When you are inside of the container loging to the database
    ```
    mysql -u appuser -p reactlibrarydatabase
    ```

3. Input the password of the mysql user that is on the .env variables

4. Run the following command on a table, like this example
    ```
    select * from review;
    ```

5. The database should return the records for the review table