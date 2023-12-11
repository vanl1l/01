package project3.domain;

import project3.service.Status;

public class Programmer extends Employee{
    private int memberId;//开发团队中tId
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer(){}
    public Programmer(int id,String name,int age,double salary,Equipment equipment){
        super(id, name,age,salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public Status getStatus() {
        return status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
