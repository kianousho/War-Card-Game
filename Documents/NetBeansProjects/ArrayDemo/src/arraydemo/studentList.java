/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

public class studentList {
    public static void main(String[] args){
        //comment added at 1:29 PM 
        // friday 
        Student s1 = new Student("s1","ronak");
        Student[] studentList = new Student[3]; 
        
        studentList[0] =s1;
        studentList[1] =new Student("s2","abc");
        studentList[2] = new Student("s3","def");
        
        for( int i =0;i<studentList.length;i++){
            System.out.println(studentList[i].getsName());
        }
    }
    
}
