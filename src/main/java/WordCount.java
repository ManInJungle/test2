import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

import javax.xml.soap.Text;
import java.io.IOException;

public class WordCount {
 public static class MyMapper implements Mapper<Object, Text, Text, IntWritable> {
  @Override
  public void map(Object o, Text text, OutputCollector<Text, IntWritable> outputCollector, Reporter reporter) throws IOException {

  }

  @Override
  public void close() throws IOException {

  }

  @Override
  public void configure(JobConf jobConf) {

  }
 }
}
