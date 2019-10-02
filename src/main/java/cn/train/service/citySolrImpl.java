package cn.train.service;

import cn.train.enity.articles;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
@Resource
@Service
public class citySolrImpl implements citySolr {

    @Override
    public List<articles> selectCity(String keyword)  {
//        建立solr连接
        HttpSolrServer server = new HttpSolrServer("http://localhost:8081/solr/articles");

        //创建一个查询对象
        SolrQuery query = new SolrQuery();

        //设置查询条件

        query.setRows(100);
        if(StringUtils.isEmpty(keyword))
        {
            query.set("q","*:*");
        }else
        {
            query.set("q","name:"+keyword);
        }

//        query.setStart(20);
//        query.setRows(50);

        //执行查询
        List<articles> articleslist = null;
        try {
            QueryResponse response = server.query(query);  
            //取查询结果
//        SolrDocumentList list = response.getResults();
             articleslist=response.getBeans(articles.class);
            for (articles p:articleslist
            ) {
                System.out.println(p.toString());
            }
//        System.out.println("总共获取多少条数据"+list.getNumFound());
            
        }catch (Exception e)
        {
            System.out.println("错误");
        }
        
            
            return articleslist;
        

     


        
    }
}
