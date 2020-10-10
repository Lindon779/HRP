package com.gzhh.hrp.db.entity;

import com.gzhh.hrp.common.Title;
import com.gzhh.hrp.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DB_User")
@Title("用户管理")
public class User extends BaseEntity {
    @Id
    @Column(name="Teacher_Number",length=50)
    @Title("教师编号")
    private Integer teacherNumber;

    @Column(name="Teacher_Name",length=50)
    @Title("教师姓名")
    private String teacherName;

    @Column(name="Position_Number",length=50)
    @Title("岗位编号")
    private  Integer positionNumber;

    @Column(name="Teach_Position_Type",length=50)
    @Title("教学岗位类型")
    private String teachPositionType;

    @Column(name="Position_Level",length=50)
    @Title("岗位级别")
    private Integer positionLevel;

    @Column(name="Permission_Number",length=50)
    @Title("权限编号")
    private Integer permissionNumber;

    public Integer getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(Integer teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getPositionNumber() {
        return positionNumber;
    }

    public void setPositionNumber(Integer positionNumber) {
        this.positionNumber = positionNumber;
    }

    public String getTeachPositionType() {
        return teachPositionType;
    }

    public void setTeachPositionType(String teachPositionType) {
        this.teachPositionType = teachPositionType;
    }

    public Integer getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(Integer positionLevel) {
        this.positionLevel = positionLevel;
    }

    public Integer getPermissionNumber() {
        return permissionNumber;
    }

    public void setPermissionNumber(Integer permissionNumber) {
        this.permissionNumber = permissionNumber;
    }
}
