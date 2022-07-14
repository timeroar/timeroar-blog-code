//package com.timeroar.test.util;
//
//import com.itextpdf.html2pdf.ConverterProperties;
//import com.itextpdf.html2pdf.HtmlConverter;
//import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
//import com.itextpdf.layout.font.FontProvider;
//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.pdf.BaseFont;
//import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.tool.xml.Pipeline;
//import com.itextpdf.tool.xml.XMLWorker;
//import com.itextpdf.tool.xml.XMLWorkerHelper;
//import com.itextpdf.tool.xml.css.CssFilesImpl;
//import com.itextpdf.tool.xml.css.StyleAttrCSSResolver;
//import com.itextpdf.tool.xml.html.CssAppliersImpl;
//import com.itextpdf.tool.xml.html.HTML;
//import com.itextpdf.tool.xml.html.TagProcessorFactory;
//import com.itextpdf.tool.xml.html.Tags;
//import com.itextpdf.tool.xml.parser.XMLParser;
//import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
//import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
//import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
//import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
//
//import java.io.*;
//import java.nio.charset.Charset;
//
///**
// * PDF工具类
// */
//public class PDFUtils {
//
//    /**
//     * 生成PDF文件
//     *
//     * @param content PDF文件内容
//     * @return
//     * @throws Exception
//     */
//    public static ByteArrayOutputStream createPDF(String content) {
//        ITextRenderer renderer = new ITextRenderer();
//        OutputStream out = new ByteArrayOutputStream();
//        try {
//            // 设置字体
//            ITextFontResolver fontResolver = renderer.getFontResolver();
//            renderer.setDocumentFromString(content);
//            ClassPathResource regular = new ClassPathResource("fonts/STZHONGS.TTF");
//            fontResolver.addFont(regular.getURL().toString(), BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
//            // 把html代码传入渲染器中
//            renderer.layout();
//            renderer.createPDF(out, false);
//            renderer.finishPDF();
//            out.flush();
//            return (ByteArrayOutputStream) out;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (out != null) {
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return null;
//    }
//
//    /**
//     * 生成PDF文件并写入硬盘文件
//     *
//     * @param content  PDF文件内容
//     * @param filePath 文件全路径
//     * @return
//     */
//    public static boolean createPDF(String content, String filePath) {
//        try {
//            ByteArrayOutputStream byteArrayOutputStream = PDFUtils.createPDF(content);
//            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
//            fileOutputStream.write(byteArrayOutputStream.toByteArray());
//            return true;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//    public static boolean createPDF2(String content, String filePath) throws IOException {
//        ConverterProperties converterProperties = new ConverterProperties();
//        FontProvider dfp = new DefaultFontProvider();
//        //添加字体库
//       // dfp.addDirectory("C:/Windows/Fonts");
//        if("linux".equals(getCurrentOperatingSystem())){
//            dfp.addDirectory("/usr/share/fonts/chiness");
//        }else{
//            dfp.addDirectory("C:/Windows/Fonts");
//        }
//        converterProperties.setFontProvider(dfp);
//        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        HtmlConverter.convertToPdf(content, byteArrayOutputStream, converterProperties);
//        fileOutputStream.write(byteArrayOutputStream.toByteArray());
//        return true;
//    }
//
//
//    public static void htmlTopdf(String html, File file) throws Exception {
//        try {
//
//            // step 1
//            Document document = new Document();
//            BaseFont bfChinese;
//            ClassPathResource regular = new ClassPathResource("fonts/STZHONGS.TTF");
//            bfChinese = BaseFont.createFont(regular.getURL().toString(), BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
//            MyFontProvider myFontProvider = new MyFontProvider(BaseColor.BLACK, "", "", false, false, 16, 1, bfChinese);
//            // step 2
//            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
//            // step 3
//            document.open();
//
//            final TagProcessorFactory tagProcessorFactory = Tags.getHtmlTagProcessorFactory();
//            tagProcessorFactory.removeProcessor(HTML.Tag.IMG);
//
//            final CssFilesImpl cssFiles = new CssFilesImpl();
//            cssFiles.add(XMLWorkerHelper.getInstance().getDefaultCSS());
//            final StyleAttrCSSResolver cssResolver = new StyleAttrCSSResolver(cssFiles);
//            final HtmlPipelineContext hpc = new HtmlPipelineContext(new CssAppliersImpl(myFontProvider));
//            hpc.setAcceptUnknown(true).autoBookmark(true).setTagFactory(tagProcessorFactory);
//            final HtmlPipeline htmlPipeline = new HtmlPipeline(hpc, new PdfWriterPipeline(document, writer));
//            final Pipeline<?> pipeline = new CssResolverPipeline(cssResolver, htmlPipeline);
//
//            final XMLWorker worker = new XMLWorker(pipeline, true);
//
//            final Charset charset = Charset.forName("UTF-8");
//            final XMLParser xmlParser = new XMLParser(true, worker, charset);
//
//            ByteArrayInputStream bais = new ByteArrayInputStream(html.getBytes("UTF-8"));
//            xmlParser.parse(bais, charset);
//
//            // step 5
//            document.close();
//            bais.close();
//        } catch (Exception e) {
//            throw new Exception(e);
//        }
//    }
//
//    public static String getCurrentOperatingSystem(){
//        String os = System.getProperty("os.name").toLowerCase();
//        System.out.println("---------当前操作系统是-----------" + os);
//        return os;
//    }
//
//}
