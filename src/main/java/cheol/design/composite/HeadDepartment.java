package cheol.design.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    private Integer id;
    private String name;

    List<Department> childDepartments;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
