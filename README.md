# Data_Ducts

Basically, this project is making own system with own database. 

We are using CSV, a very simple database in this project.

* Sample Data

![Sample Data](https://user-images.githubusercontent.com/84385119/169641931-3d447572-ed14-4387-9a38-e4e64018fb5c.png)


* CSV Database

![Sample CSV](https://user-images.githubusercontent.com/84385119/169641932-c0d828c2-b90f-486b-988a-1b588e8f6a4d.png)

Features in the project:
* Concatenate
    * Before Concatenate 
    
    ![Sample_Data_Concatenate](https://user-images.githubusercontent.com/84385119/169642264-04d218e9-afda-46f6-a4fa-c97bbd80fc98.png)
    
    * Add New Column

    ![new column](https://user-images.githubusercontent.com/84385119/169642326-0693f483-fc03-425e-aebd-7493ee7b5d2e.png)
    
    * Add New Row

    ![newRow](https://user-images.githubusercontent.com/84385119/169642331-8601c23d-deb1-4e83-b1c0-767a5f413963.png)
    
    * After Concatenate

    ![afterConcatenate](https://user-images.githubusercontent.com/84385119/169642405-9f904217-0b5e-4153-992f-63af9d799bd3.png)
    
* Filter
    * By Row 

      ![filterRow](https://user-images.githubusercontent.com/84385119/169642790-6c5dbb1f-392e-4c0f-a095-388ccc1c8e78.png)
      
    * By Column

      ![filterColumn](https://user-images.githubusercontent.com/84385119/169642792-8337d3a0-15a8-4d22-bd76-e33f89336400.png)
      
* Sorting
    * By Column (Current CGPA)

      ![sorting_Column](https://user-images.githubusercontent.com/84385119/169642919-a9529bdf-09fe-4a03-b73b-c31102050cfe.png)
      
* Remove Duplicate Data _(Only remove the data with condition)_
    * Before Remove 
    
      ![afterConcatenate](https://user-images.githubusercontent.com/84385119/169642405-9f904217-0b5e-4153-992f-63af9d799bd3.png)
      
    * After Remove

      ![afterRemoveDupl](https://user-images.githubusercontent.com/84385119/169643164-48c3f51a-46ad-4cdd-a061-8f27b2681438.png)

* Remove Missing Data _(Only remove the data with condition)_
    * Before Remove 
    
      ![afterRemoveDupl](https://user-images.githubusercontent.com/84385119/169643164-48c3f51a-46ad-4cdd-a061-8f27b2681438.png)
      
    * After Remove

      ![removeMissing](https://user-images.githubusercontent.com/84385119/169643218-d3f2716d-9e23-4fc9-af51-cb2db1cbbd4a.png)
      
      
Based on the project requirement, we are requiring recording the data into CSV file type and read the data out from the CSV file. In this project, we have some manipulation methods such as concatenate the data, filter the data (Method to obtain a subset of DataFrame with range of row or column), sorting, and removing data. We also have some statistics function and scaler’s function. And we have also built some graph and scrap some data from the internet and write into the csv file as our extra features. Since this is our first project, implement all the basic requirement already use up all of our times, that’s why we are did not afford to make a good interface for this project.
