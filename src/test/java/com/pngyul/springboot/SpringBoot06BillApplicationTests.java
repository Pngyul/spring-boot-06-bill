package com.pngyul.springboot;

import com.pngyul.springboot.entities.User;
import com.pngyul.springboot.utils.RedisClient;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringBoot06BillApplicationTests {

	@Autowired
	RedisClient redisClient;

	@Autowired
	StringRedisTemplate stringRedisTemplate;

	@Autowired
	RedisTemplate jsonRedisTemplate;


	@Test
	public void contextLoads() {


		//jsonRedisTemplate.opsForHash().put("myhah2","user2",new User("zhansgan",1));
		jsonRedisTemplate.opsForHash().put("myhash","user3",new User("zhansgan",1));
		Object o = jsonRedisTemplate.opsForHash().get("myhash", "user3");
		System.out.println(o);

		/*redisClient.set("user1",new User("zhansgan",1));
		Object user1 = redisClient.get("user1");
		System.out.println(user1);
*/


		//String ss = (String) redisClient.get("ss");
		//Object hget = redisClient.hget("myhash","fi");
		//redisClient.hset("myhash","f2","what?");

//		stringRedisTemplate.opsForValue().set("00","等方面介绍了客户飞机离开");
//		Object o = stringRedisTemplate.opsForHash().get("myhash", "fi");
		//System.out.println("myhash:"+ss);
	}

	@Test
	public  void openFile() {
		String filePath="XXXX";
		File file = new File(filePath);
		try {
			InputStream in = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			//log.error("can found file [{}]", filePath, e,3);
			//e.printStackTrace();
			//e.getStackTrace();
			log.error("can found file [{}],cause:{}", filePath, e);
		}
	}

	@Test
	public  void stre1am() {

		String[] a = {"aa","bb","cc"};
		Arrays.stream(a).forEach(System.out::println);

	}

}
