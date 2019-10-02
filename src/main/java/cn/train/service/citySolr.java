package cn.train.service;

import cn.train.enity.articles;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
@Resource
@Service
public interface citySolr {
    public List<articles> selectCity(String city) throws IOException, SolrServerException, Exception;
}
