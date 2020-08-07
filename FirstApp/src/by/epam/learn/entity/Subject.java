package by.epam.learn.entity;

import java.util.Objects;

public class Subject {
    private long subjectId;
    private String name;

    public Subject(long subjectId, String name) {
        this.subjectId = subjectId;
        this.name = name;
    }

    public Subject(long subjectId) {
        this.subjectId = subjectId;
    }

    public Subject(String name) {
        this.name = name;
    }

    public Subject() { }

    public long getSubjectId() {
        return subjectId;
    }

    public String getName() {
        return name;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return subjectId == subject.subjectId &&
                name.equals(subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectId, name);
    }
}
