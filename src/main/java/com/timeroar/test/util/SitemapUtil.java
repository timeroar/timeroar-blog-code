package com.timeroar.test.util;

import com.redfin.sitemapgenerator.*;

import java.io.File;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>SitemapUtil</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2022/6/29 11:03
 */
public class SitemapUtil {

    public static void generateSitemap() {
        String tempPath = "D:/home/seo";
        //String tempPath = System.getProperty("java.io.tmpdir") + File.separator + "/seo/";
        File file = new File(tempPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        String domain = "https://www.domain.com";
        try {
            WebSitemapGenerator g1 = WebSitemapGenerator.builder(domain, file)
                    .fileNamePrefix("article").build();
            Date date = new Date();
            String s = LocalDate.now().toString();
            for (int i = 1; i < 21; i++) {
                WebSitemapUrl url = new WebSitemapUrl.Options(domain + "/article/" + i )
                        .changeFreq(ChangeFreq.DAILY)
                        .lastMod(s).build();
                g1.addUrl(url);
            }

         /*   WebSitemapGenerator g2 = WebSitemapGenerator.builder(domain, file)
                    .fileNamePrefix("issue").build();
            Date date2 = new Date();
            for (int i = 1; i < 21; i++) {
                WebSitemapUrl url = new WebSitemapUrl.Options(domain + "/issue/" + i ).lastMod(date2).build();
                g2.addUrl(url);
            }*/

            List<String> fileNames = new ArrayList<>();

            // 生成 sitemap 文件
            List<File> articleFiles = g1.write();
            articleFiles.forEach(e -> fileNames.add(e.getName()));
         /*   List<File> issueFiles = g2.write();
            issueFiles.forEach(e -> fileNames.add(e.getName()));*/

            // 构造 sitemap_index 生成器
            W3CDateFormat dateFormat = new W3CDateFormat(W3CDateFormat.Pattern.DAY);
            SitemapIndexGenerator sitemapIndexGenerator = new SitemapIndexGenerator
                    .Options(domain, new File(tempPath + "sitemap_index.xml"))
                    .dateFormat(dateFormat)
                    .autoValidate(true)
                    .build();

            fileNames.forEach(e -> {
                try {
                    // 组装 sitemap 文件 URL 地址
                    sitemapIndexGenerator.addUrl(domain + "/" + e);
                } catch (MalformedURLException e1) {
                    e1.printStackTrace();
                }
            });

            // 生成 sitemap_index 文件
            sitemapIndexGenerator.write();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


       /* StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        sb.append("<urlset xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\">\n");
        sb.append("<url>\n");
        sb.append("<loc>" + url + "</loc>\n");
        sb.append("<lastmod>" + "2020-06-29" + "</lastmod>\n");
        sb.append("<changefreq>" + "daily" + "</changefreq>\n");
        sb.append("<priority>" + "1.0" + "</priority>\n");
        sb.append("</url>\n");
        sb.append("</urlset>\n");
        FileUtil.writeFile(fileName, sb.toString());*/
    }
}
