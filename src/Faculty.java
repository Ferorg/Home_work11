import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty {
    public static IsActive isActive;
    private String nameFaculty;
    private List<Group> groupList = new ArrayList<>();
    private static IsActive IsActive;

    public Faculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public void addGroup(Group group) {
        groupList.add(group);
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public String toString() {
        return "Faculty{" +
                "nameFaculty='" + nameFaculty + '\'' +
                ", groupList=" + groupList +
                '}';
    }

    public static IsActive getIsActive() {
        return IsActive;
    }

    public void setIsActive(IsActive isActive) {
        IsActive = isActive;
    }
}
