package kapi.kapi.xml;

import java.util.ArrayList;
import java.util.List;

public class Object {
    public String id;
    public String title;
    public List<String> authors = new ArrayList<>();
    public int date;
    public List<String> publishers = new ArrayList<>();
    public String educationaltype;
    public List<String> keywords = new ArrayList<>();
    public List<Rubric> rubrics = new ArrayList<>();
    public int duration;
    public List<Integer> classes = new ArrayList<>();
    public Action action;
}
