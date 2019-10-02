package cn.train.controller;

import cn.train.enity.articles;
import cn.train.service.citySolrImpl;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
@RestController
public class citySolrController {
    @Autowired
     citySolrImpl citySolr;
    @RequestMapping("/search")
    public List<articles> search(@RequestBody articles articles1)  {
        System.out.println(articles1.getName());
        return citySolr.selectCity(articles1.getName());
    }
}
