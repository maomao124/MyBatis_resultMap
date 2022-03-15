import java.util.List;
import java.util.Map;

/**
 * Project name(项目名称)：MyBatis_resultMap
 * Package(包名): PACKAGE_NAME
 * Interface(接口名): SiteMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/15
 * Time(创建时间)： 20:15
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface SiteMapper
{
    @SuppressWarnings("all")
    public List<Map<String, Object>> selectSite();

    public List<Site> selectSite1();
}