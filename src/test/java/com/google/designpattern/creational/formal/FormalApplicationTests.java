package com.google.designpattern.creational.formal;

import com.google.designpattern.creatianl.factory.b$formal.AbstractVideo;
import com.google.designpattern.creatianl.factory.b$formal.JavaVideo;
import com.google.designpattern.creatianl.factory.b$formal.PythonVideo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FormalApplicationTests {

	/**
	 * 需要每次new的对象不同
	 */
	@Test
	public void testFormal() {

		AbstractVideo abstractVideo = new JavaVideo();
		abstractVideo.product();

		AbstractVideo abstractVideo1 = new PythonVideo();
		abstractVideo1.product();

	}

}

