package com.example.project;

public class Student {
    // instance variables for 
    // first name (String)
    private String firstName;
    // last name (String)
    private String lastName;
    // graduation year (int)
    private int gradYear;
    // sum of test scores (double).. should initialize at 0.0
    private double sumOfTestScores = 0.0;
    // test score count (int) ..should initialize at 0
    private int testScoreCounter = 0;
    // highest test score (double).. should initialize at 0.0
    private double highestTestScore = 0.0;
 
    // constructor
    public Student(String pFirstName, String pLastName, int pGradYear) {
        //implement code here!
        firstName = pFirstName;
        lastName = pLastName;
        gradYear = pGradYear;
    }
 
    // returns firstName
    public String getFirstName() {
        //implement code here!
        return firstName;
    }
 
    // returns lastName
    public String getLastName() {
        //implement code here!
        return lastName;
    }
 
    public double getHighestTestScore() {
        //implement code here!
        return highestTestScore;
    }

    public int getTestScoreCount(){
        //implement code here!
        return testScoreCounter;
    }

    public int getGradYear(){
        //implement code here!
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        //implement code here!
        gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    
    public void addTestScore(double newTestScore) {
        //implement code here!
        if (newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
        sumOfTestScores += newTestScore;
        testScoreCounter += 1;
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        //implement code here!
        return averageTestScore() >= 65;
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        //implement code here!
        // works because sumOfTestScores is double
        return sumOfTestScores / testScoreCounter;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 