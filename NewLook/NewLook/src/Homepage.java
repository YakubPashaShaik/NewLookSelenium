//package com.example.tests;

import com.thoughtworks.selenium.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author salhawi
 * This is a test checking all the shopping links on the homepage, including the carousel.
 *
 */

@SuppressWarnings("deprecation")
public class Homepage extends SeleneseTestCase {
	private Selenium selenium;
	
/**
 * This opens up the browser using the browser and URL specified. The window is then maximised.
 */

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://m.newlook.com/mcs/publish/2559/28551");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
	}
	
/**
 * 	This method opens up all of the links, verifies the elements and then returns to the homepage.
 */

	@Test
	public void testNLTestOne() throws Exception {
		selenium.open("/mcs/publish/2559/28551");
		selenium.click("//a[contains(@href, '28551?page_62313=1')]");
		selenium.waitForPageToLoad("30000");
		selenium.click("//a[contains(@href, '28551?page_62313=2')]");
		selenium.waitForPageToLoad("30000");
		selenium.click("//a[contains(@href, '28551?page_62313=3')]");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=body > div > div > table > tbody > tr > td > div > div > a");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=body > div > div > table > tbody > tr > td > div > div > a");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=body > div > div > table > tbody > tr > td > div > div > a");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=NEW IN");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=WOMENS NEW IN");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=MENS NEW IN");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=TEENS NEW IN");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=WOMENS");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=VIEW ALL");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=VIEW ALL CLOTHING");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL FOOTWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL FOOTWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL ACCESSORIES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL ACCESSORIES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL BRANDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL BRANDS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP DEPARTMENT")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP DEPARTMENT");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=DRESSES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=DRESSES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TOPS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TOPS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=KNITWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=KNITWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JACKETS & COATS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JACKETS & COATS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TROUSERS & SHORTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TROUSERS & SHORTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PLAYSUITS & JUMPSUITS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PLAYSUITS & JUMPSUITS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JEANS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JEANS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=LEGGINGS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=LEGGINGS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SKIRTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SKIRTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=LINGERIE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=LINGERIE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=NIGHTWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=NIGHTWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SWIMWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SWIMWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOES & BOOTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOES & BOOTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ACCESSORIES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ACCESSORIES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BAGS & PURSES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BAGS & PURSES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JEWELLERY & HAIR ACCESSORIES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JEWELLERY & HAIR ACCESSORIES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP RANGE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP RANGE");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=TALL");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PETITE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PETITE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP COLLECTION")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP COLLECTION");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=CHEAP CHIC");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PARTY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PARTY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=HOLIDAY SHOP")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=HOLIDAY SHOP");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=KELLY BROOK")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=KELLY BROOK");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TAILORING")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TAILORING");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=EXCLUSIVES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=EXCLUSIVES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ONLINE PARTY EXCLUSIVES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ONLINE PARTY EXCLUSIVES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PROM SHOP")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PROM SHOP");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MAXI")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MAXI");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=DENIM")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=DENIM");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=CROP SHOP")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=CROP SHOP");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WEDDING BELLES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WEDDING BELLES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP TRENDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP TRENDS");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=EASTERN TRAIL");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MONOCHROME")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MONOCHROME");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=90S")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=90S");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PINAFORES AND DUNGAREES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PINAFORES AND DUNGAREES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PAGAN COWGIRL")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PAGAN COWGIRL");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PLEASANTVILLE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PLEASANTVILLE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=FLORALS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=FLORALS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MONOGRAPHIK")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MONOGRAPHIK");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BLEACH OUT")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BLEACH OUT");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP BRANDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP BRANDS");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=LABEL LOUNGE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=LIMITED")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=LIMITED");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SALE");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=WOMENS SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VESTS AND BANDEAUS 2 FOR £5, 3 FOR £7.50")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VESTS AND BANDEAUS 2 FOR £5, 3 FOR £7.50");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=2 FOR £15 PRINTED TEES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=2 FOR £15 PRINTED TEES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=DENIM NOW £15")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=DENIM NOW £15");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=INSPIRE SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=INSPIRE SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MATERNITY SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MATERNITY SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOE GALLERY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOE GALLERY");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=VIEW ALL");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL SHOES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL SHOES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL BOOTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL BOOTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL WIDE FIT")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL WIDE FIT");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BRANDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BRANDS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL LABEL LOUNGE ACCESSORIES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL LABEL LOUNGE ACCESSORIES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOES");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=HIGH HEELS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=HIGH HEELS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MID HEELS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MID HEELS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=FLATS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=FLATS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BOOTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BOOTS");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ANKLE BOOTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ANKLE BOOTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=HIGH LEG BOOTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=HIGH LEG BOOTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WELLIES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WELLIES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WIDE FIT SHOES & BOOTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WIDE FIT SHOES & BOOTS");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WIDE HIGH HEELS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WIDE HIGH HEELS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WIDE MID HEELS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WIDE MID HEELS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WIDE FLATS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WIDE FLATS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WIDE ANKLE BOOTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WIDE ANKLE BOOTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WIDE HIGH LEG BOOTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WIDE HIGH LEG BOOTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP COLLECTION")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP COLLECTION");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=EXCLUSIVES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=EXCLUSIVES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PARTY SHOES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PARTY SHOES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=EST. 1969")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=EST. 1969");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WORKWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WORKWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PROM")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PROM");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BRIDAL")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BRIDAL");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP TRENDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP TRENDS");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PRINTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PRINTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SPORTS LUXE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SPORTS LUXE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=HOLIDAY BRIGHTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=HOLIDAY BRIGHTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MONOCHROME")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MONOCHROME");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ANKLE STRAP")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ANKLE STRAP");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=NUDES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=NUDES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WHITE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WHITE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ANDROGYNOUS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ANDROGYNOUS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PAGAN COWGIRL")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PAGAN COWGIRL");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=EASTERN TRAIL")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=EASTERN TRAIL");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SALE");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOES & BOOTS SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOES & BOOTS SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=CASUAL FOOTWEAR 2 FOR £10")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=CASUAL FOOTWEAR 2 FOR £10");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MATERNITY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MATERNITY");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL MATERNITY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL MATERNITY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL BRANDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL BRANDS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP DEPARTMENT")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP DEPARTMENT");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TOPS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TOPS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=DRESSES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=DRESSES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=KNITWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=KNITWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SKIRTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SKIRTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TROUSERS & SHORTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TROUSERS & SHORTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JEANS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JEANS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JACKETS & COATS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JACKETS & COATS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=LEGGINGS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=LEGGINGS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SWIMWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SWIMWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=LINGERIE & NIGHTWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=LINGERIE & NIGHTWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP COLLECTION")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP COLLECTION");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BUMP ON A BUDGET")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BUMP ON A BUDGET");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ESSENTIALS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ESSENTIALS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=STRIPE IT LUCKY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=STRIPE IT LUCKY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MULTIPACKS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MULTIPACKS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MAXI")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MAXI");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ONLINE EXCLUSIVES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ONLINE EXCLUSIVES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WORK WARDROBE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WORK WARDROBE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=LOUNGEWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=LOUNGEWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WINTER SUN")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WINTER SUN");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=FASHION EDIT")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=FASHION EDIT");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=10% OFF LAST CHANCE TO BUY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=10% OFF LAST CHANCE TO BUY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP TRENDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP TRENDS");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PASTELS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PASTELS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MONOCHROME")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MONOCHROME");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SALE");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MATERNITY SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MATERNITY SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=T-SHIRTS 2 FOR £15")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=T-SHIRTS 2 FOR £15");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BASIC TOPS 2 FOR £10")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BASIC TOPS 2 FOR £10");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BASIC TOPS 2 FOR £12")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BASIC TOPS 2 FOR £12");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=INSPIRE - PLUS SIZES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=INSPIRE - PLUS SIZES");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL INSPIRE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL INSPIRE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL BRANDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL BRANDS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP DEPARTMENT")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP DEPARTMENT");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=DRESSES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=DRESSES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TOPS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TOPS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TROUSERS & SHORTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TROUSERS & SHORTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JEANS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JEANS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=KNITWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=KNITWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SKIRTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SKIRTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JACKETS & COATS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JACKETS & COATS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=LEGGINGS & HOSIERY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=LEGGINGS & HOSIERY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=NIGHTWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=NIGHTWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BELTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BELTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SWIMWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SWIMWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP COLLECTION")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP COLLECTION");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ONLINE EXCLUSIVES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ONLINE EXCLUSIVES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=GOING OUT")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=GOING OUT");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WORK WARDROBE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WORK WARDROBE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SPRING PREVIEW")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SPRING PREVIEW");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=FASHION EDIT")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=FASHION EDIT");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=10% OFF LAST CHANCE TO BUY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=10% OFF LAST CHANCE TO BUY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=CHEAP CHIC")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=CHEAP CHIC");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MAXI")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MAXI");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MULTIPACKS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MULTIPACKS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PARTY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PARTY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=HOLIDAY SHOP")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=HOLIDAY SHOP");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP TRENDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP TRENDS");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=COWGIRL")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=COWGIRL");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MONOCHROME")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MONOCHROME");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BLUESVILLE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BLUESVILLE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=AZTEC")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=AZTEC");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=EASTERN TRAIL")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=EASTERN TRAIL");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SALE");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=INSPIRE SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=INSPIRE SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TOPS 2 FOR £12")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TOPS 2 FOR £12");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=LABEL LOUNGE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=LABEL LOUNGE");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WOMENS BRANDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WOMENS BRANDS");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL CLOTHING")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL CLOTHING");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL FOOTWEAR & ACCESSORIES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL FOOTWEAR & ACCESSORIES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WOMENS A-Z")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WOMENS A-Z");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP DEPARTMENT")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP DEPARTMENT");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=DRESSES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=DRESSES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=FOOTWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=FOOTWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TOPS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TOPS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JACKETS & COATS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JACKETS & COATS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TROUSERS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TROUSERS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JEANS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JEANS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=KNITWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=KNITWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SKIRTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SKIRTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BAGS & PURSES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BAGS & PURSES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=LINGERIE & NIGHTWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=LINGERIE & NIGHTWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=FANCY DRESS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=FANCY DRESS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SWIMWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SWIMWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JEWELLERY & WATCHES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JEWELLERY & WATCHES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ACCESSORIES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ACCESSORIES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BEAUTY AND FRAGRANCE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BEAUTY AND FRAGRANCE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=GIFTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=GIFTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SALE");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BRANDS SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BRANDS SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MENS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MENS");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL CLOTHING")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL CLOTHING");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL FOOTWEAR & ACCESSORIES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL FOOTWEAR & ACCESSORIES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MENS BRANDS A-Z")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MENS BRANDS A-Z");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP DEPARTMENT")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP DEPARTMENT");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=T-SHIRTS & POLO SHIRTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=T-SHIRTS & POLO SHIRTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=CHINOS & TROUSERS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=CHINOS & TROUSERS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JEANS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JEANS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHIRTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHIRTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHORTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHORTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JUMPERS & CARDIGANS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JUMPERS & CARDIGANS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=HOODIES & SWEATS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=HOODIES & SWEATS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JACKETS & COATS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JACKETS & COATS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=UNDERWEAR, SOCKS & PYJAMAS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=UNDERWEAR, SOCKS & PYJAMAS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOES & BOOTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOES & BOOTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BAGS & WALLETS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BAGS & WALLETS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ACCESSORIES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ACCESSORIES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SWIMWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SWIMWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP COLLECTION")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP COLLECTION");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PROM KING")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PROM KING");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=THRIFTY THREADS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=THRIFTY THREADS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JERSEY ESSENTIALS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JERSEY ESSENTIALS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TAILORING")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TAILORING");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=EXCLUSIVES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=EXCLUSIVES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=HOLIDAY SHOP")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=HOLIDAY SHOP");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=10% OFF LAST CHANCE TO BUY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=10% OFF LAST CHANCE TO BUY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP TRENDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP TRENDS");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BRIGHTON BEACH")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BRIGHTON BEACH");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MR BRIGHTSIDE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MR BRIGHTSIDE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=AZTEC")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=AZTEC");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VARSITY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VARSITY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=80S MASH CULTURE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=80S MASH CULTURE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=NEW VINTAGE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=NEW VINTAGE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SALE");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MENS SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MENS SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=CANVAS PUMPS 2 FOR £12")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=CANVAS PUMPS 2 FOR £12");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JEANS 2 FOR £30")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JEANS 2 FOR £30");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=LONG SLEEVE SHIRTS 2 FOR £20")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=LONG SLEEVE SHIRTS 2 FOR £20");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BOXER SHORTS & SOCKS 3 FOR 2")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BOXER SHORTS & SOCKS 3 FOR 2");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TEENS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TEENS");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL CLOTHING")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL CLOTHING");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL FOOTWEAR & ACCESSORIES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL FOOTWEAR & ACCESSORIES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP DEPARTMENT")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP DEPARTMENT");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TOPS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TOPS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=DRESSES & PLAYSUITS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=DRESSES & PLAYSUITS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=KNITWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=KNITWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JACKETS & COATS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JACKETS & COATS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=JEANS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=JEANS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TROUSERS & SHORTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TROUSERS & SHORTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=LEGGINGS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=LEGGINGS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SKIRTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SKIRTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=UNDERWEAR & NIGHTWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=UNDERWEAR & NIGHTWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SWIMWEAR")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SWIMWEAR");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=HANDBAGS & PURSES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=HANDBAGS & PURSES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ACCESSORIES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ACCESSORIES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOES & BOOTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOES & BOOTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP COLLECTION")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP COLLECTION");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=POCKET MONEY PURCHASES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=POCKET MONEY PURCHASES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=HUDSON & ROSE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=HUDSON & ROSE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BACK TO SCHOOL")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BACK TO SCHOOL");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ONLINE EXCLUSIVES")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ONLINE EXCLUSIVES");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=10% OFF LAST CHANCE TO BUY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=10% OFF LAST CHANCE TO BUY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PROM")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PROM");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP TRENDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP TRENDS");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SPORTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SPORTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MONOCHROME")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MONOCHROME");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SLOGANS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SLOGANS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=COWGIRL")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=COWGIRL");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=AZTEC")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=AZTEC");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PASTELS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PASTELS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOP LABEL LOUNGE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOP LABEL LOUNGE");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=VIEW ALL TEENS & KIDS BRANDS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=VIEW ALL TEENS & KIDS BRANDS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PINEAPPLE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PINEAPPLE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PAUL FRANK")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PAUL FRANK");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SALE");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TEENS SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TEENS SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=£5 OFF SELECTED DENIM")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=£5 OFF SELECTED DENIM");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=PRINTED T-SHIRTS 2 FOR £10")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=PRINTED T-SHIRTS 2 FOR £10");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TEENS HOODIES NOW £9.99")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TEENS HOODIES NOW £9.99");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=2 FOR £8 T-SHIRTS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=2 FOR £8 T-SHIRTS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("css=div.class_28551_22 > a")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("css=div.class_28551_22 > a");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("css=div.class_28551_12 > a")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("css=div.class_28551_12 > a");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=CLOTHING SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=CLOTHING SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=SHOES & BOOTS SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=SHOES & BOOTS SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ACCESSORIES SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ACCESSORIES SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=INSPIRE SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=INSPIRE SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MATERNITY SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MATERNITY SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=WOMENS OFFERS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=WOMENS OFFERS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=BRANDS SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=BRANDS SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=LAST CHANCE TO BUY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=LAST CHANCE TO BUY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("css=div.class_28551_21 > a")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("css=div.class_28551_21 > a");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=CLOTHING SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=CLOTHING SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=ACCESSORIES & FOOTWEAR SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=ACCESSORIES & FOOTWEAR SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MENS OFFERS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MENS OFFERS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=10% OFF LAST CHANCE TO BUY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=10% OFF LAST CHANCE TO BUY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("css=div.class_28551_18 > a")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("css=div.class_28551_18 > a");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=CLOTHING SALE")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=CLOTHING SALE");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=TEENS OFFERS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=TEENS OFFERS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=10% OFF LAST CHANCE TO BUY")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=10% OFF LAST CHANCE TO BUY");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=MY ACCOUNT")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=MY ACCOUNT");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=DELIVERY & FREE RETURNS")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=DELIVERY & FREE RETURNS");
		selenium.waitForPageToLoad("30000");
		selenium.goBack();
		// selenium.();
	}
	
	/**
	 * This closes the browser.
	 */

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}

