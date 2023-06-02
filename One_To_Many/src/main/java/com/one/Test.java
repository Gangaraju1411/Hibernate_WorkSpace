package com.one;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		CategoryDao dao = new CategoryImpl();
		
		/*
		 * call savaCategory method
		 */
		
		
		CategoryEntity ct = new CategoryEntity();
		ct.setCategoryId(11188);
		ct.setCategoryName("Electric");
		
		ProductEntity pt = new ProductEntity();
		pt.setProductId(1001);
		pt.setProductName("Mobile");
		
		
		File file1 = new File("D:\\imp\\image1.jpg");
		byte[] bytes = new byte[(int)file1.length()];
		FileInputStream fis1 = new FileInputStream(file1);
		fis1.read(bytes);
		pt.setProductImage(bytes);
		
		
		
		
		
		
		ProductEntity pt2 = new ProductEntity();
		pt2.setProductId(1002);
		pt2.setProductName("Mobile2");
		
		
		File file2 = new File("D:\\imp\\image2.png");
		byte[] bytes2 = new byte[(int)file1.length()];
		FileInputStream fis2 = new FileInputStream(file1);
		fis1.read(bytes);
		pt2.setProductImage(bytes);
		
	List<ProductEntity> lstOfProducts = Arrays.asList(pt,pt2)	;
	
	ct.setLstOfProducts(lstOfProducts);
	
		dao.saveCategory(ct);
		
/*
		CategoryEntity cEntity = dao.fetchCategory(11188);
		System.out.println("category Name:"+cEntity.getCategoryName());;
		List<ProductEntity> lst = cEntity.getLstOfProducts();
		
		// read the first element of the list
		ProductEntity pEntity = lst.get(0);
		System.out.println("product Id:"+pEntity.getProductId());
		System.out.println("product Name:"+pEntity.getProductName());
		byte[] bytesOfImage = pEntity.getProductImage();
		File f1 = new File("D:\\imp\\Imagefromdb\\pic.jpg");
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(bytesOfImage);
		System.out.println("please check the image at:"+f1.getAbsolutePath());
		
		*/
		
		/*
		 * call removeCategory()
		 */
	
//	dao.removeCategory(11188);
	
	}

}
