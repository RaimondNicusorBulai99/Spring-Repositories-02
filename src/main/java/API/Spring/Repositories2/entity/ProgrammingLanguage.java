package API.Spring.Repositories2.entity;

import javax.persistence.*;

@Entity
@Table
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String name;
    private int firstAppearance; //this is a year
    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(String name, int firstAppearance, String inventor) {
        this.name = name;
        this.firstAppearance = firstAppearance;
        this.inventor = inventor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(int firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}