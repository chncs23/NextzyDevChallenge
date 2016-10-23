package io.github.chncs23.nextzydevchallenge;

import com.google.gson.Gson;
import io.github.chncs23.nextzydevchallenge.entity.PostDataSet;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test public void isParseSuccess() throws Exception {
        PostDataSet postDataSet = new Gson().fromJson("{\n"
                + "  \"kind\": \"blogger#postList\",\n"
                + "  \"nextPageToken\": \"CgkIChjg27Gk5ioQ1-S7qYWZq6gd\",\n"
                + "  \"items\": [\n"
                + "    {\n"
                + "      \"kind\": \"blogger#post\",\n"
                + "      \"id\": \"620665199613740521\",\n"
                + "      \"blog\": {\n"
                + "        \"id\": \"2112378201659339351\"\n"
                + "      },\n"
                + "      \"published\": \"2016-10-22T07:02:00+07:00\",\n"
                + "      \"updated\": \"2016-10-22T07:06:09+07:00\",\n"
                + "      \"etag\": \"\\\"GtyIIQmNmmUjEA0nwhSqMElCJ1g/dGltZXN0YW1wOiAxNDc3MDk0NzY5MDY3Cm9mZnNldDogMjUyMDAwMDAK\\\"\",\n"
                + "      \"url\": \"http://www.akexorcist.com/2016/10/enablefreeformmodeinandroidn.html\",\n"
                + "      \"selfLink\": \"https://www.googleapis.com/blogger/v3/blogs/2112378201659339351/posts/620665199613740521\",\n"
                + "      \"title\": \"[Android Dev Tips] วิธีการเปิด Freeform Mode บน Android 7.0 Nougat ขึ้นไป \",\n"
                + "      \"content\": \"<br />\\n<div class=\\\"separator\\\" style=\\\"clear: both; text-align: center;\\\">\\n</div>\\n<div class=\\\"separator\\\" style=\\\"clear: both; text-align: center;\\\">\\n<a href=\\\"https://3.bp.blogspot.com/-NyNrql85Jwc/WAqldjS1aeI/AAAAAAAA_8A/YnwQuIf5Y2MgLBA9wBIXKNldNiome93LwCLcB/s1600/enable_free_form_mode_in_android_n-header.jpg\\\" imageanchor=\\\"1\\\" style=\\\"margin-left: 1em; margin-right: 1em;\\\"><img border=\\\"0\\\" height=\\\"330\\\" src=\\\"https://3.bp.blogspot.com/-NyNrql85Jwc/WAqldjS1aeI/AAAAAAAA_8A/YnwQuIf5Y2MgLBA9wBIXKNldNiome93LwCLcB/s640/enable_free_form_mode_in_android_n-header.jpg\\\" width=\\\"640\\\" /></a></div>\\n<br />\\n&nbsp; &nbsp; &nbsp; &nbsp; Multi Window เป็นฟีเจอร์ใหม่ที่ถูกเพิ่มเข้ามาใน Android 7.0 Nougat จึงทำให้อุปกรณ์แอนดรอยด์ในอนาคตสามารถแอปฯหลายๆตัวพร้อมๆกันได้ โดยที่ Multi Window นั้นถูกแบ่งออกเป็น 2 รูปแบบด้วยกันคือ Split-Screen Mode กับ Freeform Mode ซึ่งมีรูปแบบในการทำงานที่แตกต่างกันไป<br />\\n<br />\\n&nbsp; &nbsp; &nbsp; &nbsp; แต่เจ้าของบล็อกกลับพบว่าในตอน (ที่เขียนบทความ) นี้ อุปกรณ์แอนดรอยด์ที่ได้ใช้ Android 7.0 นั้นมีแต่ Nexus และทุกรุ่นกลับไม่ได้เปิดใช้งาน Freeform Mode ซะงั้น!!<br />\\n<br />\\n<a name='more'></a><h3>\\nFreeform Mode?</h3>\\n&nbsp; &nbsp; &nbsp; &nbsp; Freeform Mode เป็นการทำให้แอปฯแต่ละตัวแสดงเป็นหน้าต่างย่อยอยู่บนหน้าจอ สามารถย้ายตำแหน่ง ปรับขนาดได้ตามใจชอบ หรือก็คือให้ความรู้สึกเหมือนใช้งาน Windows นั่นเอง โดยจะแสดงผลแยกต่างหาก<br />\\n<br />\\n<div class=\\\"separator\\\" style=\\\"clear: both; text-align: center;\\\">\\n<a href=\\\"https://2.bp.blogspot.com/-JAQAqVr6EMg/WAqodNODDrI/AAAAAAAA_8M/lyCKbPIH6PY43jxJO1FpiB8aW_YAYl3ggCLcB/s1600/enable_free_form_mode_in_android_n-001.jpg\\\" imageanchor=\\\"1\\\" style=\\\"margin-left: 1em; margin-right: 1em;\\\"><img border=\\\"0\\\" height=\\\"362\\\" src=\\\"https://2.bp.blogspot.com/-JAQAqVr6EMg/WAqodNODDrI/AAAAAAAA_8M/lyCKbPIH6PY43jxJO1FpiB8aW_YAYl3ggCLcB/s640/enable_free_form_mode_in_android_n-001.jpg\\\" width=\\\"640\\\" /></a></div>\\n<br />\\n&nbsp; &nbsp; &nbsp; &nbsp; ซึ่งเจ้าของบล็อกพบว่า Android 7.0 Nougat บน Nexus ทุกตัวนั้นเปิดให้ใช้งาน Multi Window ก็จริง แต่ว่าใช้งานได้เฉพาะแค่ Split-Screen Mode เท่านั้น ไม่สามารถใช้งาน Freeform Mode ได้<br />\\n<br />\\n&nbsp; &nbsp; &nbsp; &nbsp; ดังนั้นก็เลยไปหาข้อมูลว่าเปิดใช้งานยังไง และได้ข้อมูลมาดังนี้<br />\\n<br />\\n<h3>\\nเปิด USB Debugging เพื่อใช้งาน ADB&nbsp;</h3>\\n&nbsp; &nbsp; &nbsp; &nbsp; ขั้นตอนนี้คงไม่มีอะไรมาก เพราะผู้ที่หลงเข้ามาอ่านส่วนมากเป็นนักพัฒนาอยู่แล้ว และคงเปิด USB Debugging บนเครื่องเพื่อใช้พัฒนาแอปฯอยู่แล้ว ดังนั้นไม่อธิบายขั้นตอนนี้ละกันเนอะ<br />\\n<br />\\n<h3>\\nใช้ ADB Command เพื่อเปิดใช้งาน Freeform Mode</h3>\\n&nbsp; &nbsp; &nbsp; &nbsp; การที่ Nexus ใช้งาน Freeform Mode ไม่ได้ ก็เพราะถูกตั้งค่าให้ปิดการใช้งาน Freeform Mode ซึ่งผู้ที่หลงเข้ามาอ่านสามารถเปิดใช้งานได้ด้วยคำสั่ง ADB ดังนี้<br />\\n<br />\\n<pre style=\\\"border-radius: 0.5em; border: 2px dashed rgb(58, 121, 127); font-size: 12px; padding: 20px;\\\"><code class=\\\"language-markup\\\">adb shell settings put global enable_freeform_support 1\\n</code></pre>\\n<br />\\n<h3>\\nRestart เครื่องให้เรียบร้อย</h3>\\n&nbsp; &nbsp; &nbsp; &nbsp; เพื่อให้คำสั่งล่าสุดมีผลจะต้อง Restart เครื่องก่อน จะใช้คำสั่ง ADB หรือกด Restart เองก็ได้<br />\\n<br />\\n<pre style=\\\"border-radius: 0.5em; border: 2px dashed rgb(58, 121, 127); font-size: 12px; padding: 20px;\\\"><code class=\\\"language-markup\\\">adb reboot\\n</code></pre>\\n<br />\\n&nbsp; &nbsp; &nbsp; &nbsp; เท่านี้ก็เป็นอันเสร็จเรียบร้อย<br />\\n<br />\\n<h3>\\nทดลองใช้งาน&nbsp;</h3>\\n&nbsp; &nbsp; &nbsp; &nbsp; การใช้งาน Freeform Mode จะคล้ายๆกับ Split-Screen Mode ตรงที่ต้องเปิดแอปฯขึ้นมาก่อน แล้วกดปุ่ม Recent App หรือ App Switch (แล้วแต่จะเรียก) จากนั้นให้กดค้างที่แถบ Title ของแอปฯที่ต้องการ (ถ้าเป็น Split-Screen Mode จะให้กดค้างแล้วลากไปวางในฝั่งที่ต้องการ) แล้วจะมีปุ่มไอคอน Freeform Mode แสดงขึ้นมาข้างๆปุ่มปิดแอปฯ<br />\\n<br />\\n<div class=\\\"separator\\\" style=\\\"clear: both; text-align: center;\\\">\\n<a href=\\\"https://4.bp.blogspot.com/-8f4mSYXIsS0/WAqreu_ShzI/AAAAAAAA_8U/dv5DeNVRKPAq2uOTBs8hWkYA3g8lynsQACLcB/s1600/enable_free_form_mode_in_android_n-002.jpg\\\" imageanchor=\\\"1\\\" style=\\\"margin-left: 1em; margin-right: 1em;\\\"><img border=\\\"0\\\" height=\\\"370\\\" src=\\\"https://4.bp.blogspot.com/-8f4mSYXIsS0/WAqreu_ShzI/AAAAAAAA_8U/dv5DeNVRKPAq2uOTBs8hWkYA3g8lynsQACLcB/s640/enable_free_form_mode_in_android_n-002.jpg\\\" width=\\\"640\\\" /></a></div>\\n<br />\\n<br />\\n&nbsp; &nbsp; &nbsp; &nbsp; เพียงเท่านี้ก็สามารถใช้งาน Freeform Mode ได้แล้วจ้า<br />\\n<br />\\n<div class=\\\"separator\\\" style=\\\"clear: both; text-align: center;\\\">\\n<a href=\\\"https://4.bp.blogspot.com/-fzu-IIFunvc/WAqsETMdnjI/AAAAAAAA_8Y/TMO1HI0FjPsOgE5nzMBoYiUj2tCfazG0QCLcB/s1600/enable_free_form_mode_in_android_n-003.jpg\\\" imageanchor=\\\"1\\\" style=\\\"margin-left: 1em; margin-right: 1em;\\\"><img border=\\\"0\\\" height=\\\"272\\\" src=\\\"https://4.bp.blogspot.com/-fzu-IIFunvc/WAqsETMdnjI/AAAAAAAA_8Y/TMO1HI0FjPsOgE5nzMBoYiUj2tCfazG0QCLcB/s640/enable_free_form_mode_in_android_n-003.jpg\\\" width=\\\"640\\\" /></a></div>\\n<br />\\n<h3>\\nสรุป</h3>\\n&nbsp; &nbsp; &nbsp; &nbsp; ก็ไม่รู่หรอกนะว่าจะปิด Freeform Mode เพราะอะไร แต่เรื่องของเรื่องคืออยากจะทดสอบแอปฯว่าทำงานบน Freeform Mode ได้ปกติมั้ย ก็ให้ใช้วิธีสั่งผ่าน ADB แบบนี้เอาเนอะ<br />\\n<br />\\n<h3>\\nแหล่งข้อมูลอ้างอิง</h3>\\n&nbsp; &nbsp; &nbsp; &nbsp; • <a href=\\\"https://www.reddit.com/r/Android/comments/4bhzo4/howto_enable_freeform_window_mode_wo_unlocking/\\\" target=\\\"_blank\\\">HowTo: Enable freeform window mode w/o unlocking bootloader or installing custom recovery [Reddit]</a><br />\\n<br />\\n<br />\",\n"
                + "      \"author\": {\n"
                + "        \"id\": \"g114162000308411301557\",\n"
                + "        \"displayName\": \"Ake Exorcist\",\n"
                + "        \"url\": \"https://www.blogger.com/profile/15427271074457300336\",\n"
                + "        \"image\": {\n"
                + "          \"url\": \"//lh5.googleusercontent.com/-8jmtqovK1gc/AAAAAAAAAAI/AAAAAAAA5ZM/AkbiWBmGXZ0/s35-c/photo.jpg\"\n"
                + "        }\n"
                + "      },\n"
                + "      \"replies\": {\n"
                + "        \"totalItems\": \"0\",\n"
                + "        \"selfLink\": \"https://www.googleapis.com/blogger/v3/blogs/2112378201659339351/posts/620665199613740521/comments\"\n"
                + "      },\n"
                + "      \"labels\": [\n"
                + "        \"Android Dev Tips\"\n"
                + "      ]\n"
                + "    }\n"
                + "]\n"
                + "}", PostDataSet.class);
        assertEquals(1, postDataSet.getItems().size());
    }
}