package com.BYS.GWSystem.model;
import java.time.LocalDateTime;
import java.io.Serializable;

public class Resume implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 简历ID
     */
    private Long resumeId;

    /**
     * 生日
     */
    private LocalDateTime birthday;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机
     */
    private String phonenumber;

    /**
     * 电子邮箱
     */
    private String mailbox;

    /**
     * 现居地
     */
    private String currentResidence;

    /**
     * 学历
     */
    private String education;

    /**
     * 毕业学校
     */
    private String graduateSchool;

    /**
     * 求职意向
     */
    private String intention;

    /**
     * 个人技能
     */
    private String speciality;

    /**
     * 历练经历
     */
    private String experience;

    /**
     * 自我评价
     */
    private String selfEvaluation;

    /**
     * 创建时间
     */
    private LocalDateTime creationTime;

    /**
     * 学号
     */
    private String studentId;


    
    public Resume() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resume(Long resumeId, LocalDateTime birthday, String nativePlace, String name, String phonenumber,
			String mailbox, String currentResidence, String education, String graduateSchool, String intention,
			String speciality, String experience, String selfEvaluation, LocalDateTime creationTime, String studentId) {
		super();
		this.resumeId = resumeId;
		this.birthday = birthday;
		this.nativePlace = nativePlace;
		this.name = name;
		this.phonenumber = phonenumber;
		this.mailbox = mailbox;
		this.currentResidence = currentResidence;
		this.education = education;
		this.graduateSchool = graduateSchool;
		this.intention = intention;
		this.speciality = speciality;
		this.experience = experience;
		this.selfEvaluation = selfEvaluation;
		this.creationTime = creationTime;
		this.studentId = studentId;
	}

	public Long getResumeId() {
        return resumeId;
    }

    public void setResumeId(Long resumeId) {
        this.resumeId = resumeId;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getCurrentResidence() {
        return currentResidence;
    }

    public void setCurrentResidence(String currentResidence) {
        this.currentResidence = currentResidence;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getIntention() {
        return intention;
    }

    public void setIntention(String intention) {
        this.intention = intention;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSelfEvaluation() {
        return selfEvaluation;
    }

    public void setSelfEvaluation(String selfEvaluation) {
        this.selfEvaluation = selfEvaluation;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Resume{" +
        "resumeId=" + resumeId +
        ", birthday=" + birthday +
        ", nativePlace=" + nativePlace +
        ", name=" + name +
        ", phonenumber=" + phonenumber +
        ", mailbox=" + mailbox +
        ", currentResidence=" + currentResidence +
        ", education=" + education +
        ", graduateSchool=" + graduateSchool +
        ", intention=" + intention +
        ", speciality=" + speciality +
        ", experience=" + experience +
        ", selfEvaluation=" + selfEvaluation +
        ", creationTime=" + creationTime +
        ", studentId=" + studentId +
        "}";
    }
}
