/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Miguel A. Quevedo P.
 * @correo mquevedo@unicauca.edu.co
 * 
 */
public class clsCourseStudent {
    private Long codeSt;
    private String nameSt, emailSt, codeCourse, status;
    private double score;
    private int atteandace;

    public clsCourseStudent() {
        
    }
    public clsCourseStudent(Long codeSt, String nameSt, String emailSt, String codeCourse, double score, int atteandace, String status) {
        this.codeSt = codeSt;
        this.nameSt = nameSt;
        this.emailSt = emailSt;
        this.codeCourse = codeCourse;
        this.score = score;
        this.atteandace = atteandace;
        this.status = status;
    }

    public Long getCodeSt() {
        return codeSt;
    }

    public void setCodeSt(Long codeSt) {
        this.codeSt = codeSt;
    }

    public String getNameSt() {
        return nameSt;
    }

    public void setNameSt(String nameSt) {
        this.nameSt = nameSt;
    }

    public String getEmailSt() {
        return emailSt;
    }

    public void setEmailSt(String emailSt) {
        this.emailSt = emailSt;
    }

    public String getCodeCourse() {
        return codeCourse;
    }

    public void setCodeCourse(String codeCourse) {
        this.codeCourse = codeCourse;
    }
    
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAtteandace() {
        return atteandace;
    }

    public void setAtteandace(int atteandace) {
        this.atteandace = atteandace;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    @Override
    public String toString() {
        return "clsCourseStudent{" + "\ncodeSt=" + codeSt +
                "\nnameSt=" + nameSt +
                "\nemailSt=" + emailSt +
                "\ncodeCourse=" + codeCourse+
                "\nscore=" + score +
                "\natteandace=" + atteandace + 
                "\nstatus="+status+'}';
    }
    
    
}
