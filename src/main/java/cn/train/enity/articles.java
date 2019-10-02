package cn.train.enity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class articles   {
    @Field("id")
    private String id;

    @Field("name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "articles{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
