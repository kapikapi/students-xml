package kapi.kapi.xml;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public String id;
    public String title;
    public List<String> copyrights = new ArrayList<String>();
    public List<String> authors = new ArrayList<String>();
    public int date;
    public List<String> publishers = new ArrayList<String>();
    public List<Object> objects = new ArrayList<Object>();
    public Classification classification;
    public Handler userHandler;
    public List<Handler> handlers = new ArrayList<Handler>();
}
