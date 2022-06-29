package com.event.role.roleDao;

import com.event.privilege.dao.PrivilegeModel;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Objects;

@Entity
public class RoleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty
    private String name;
    @ManyToMany
    private List<PrivilegeModel> privilegesList;

    public RoleModel() {
    }

    public RoleModel(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PrivilegeModel> getPrivilegesList() {
        return privilegesList;
    }

    public void setPrivilegesList(List<PrivilegeModel> privilegesList) {
        this.privilegesList = privilegesList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleModel roleModel = (RoleModel) o;
        return Objects.equals(id, roleModel.id) && Objects.equals(name, roleModel.name) && Objects.equals(privilegesList, roleModel.privilegesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, privilegesList);
    }
}
