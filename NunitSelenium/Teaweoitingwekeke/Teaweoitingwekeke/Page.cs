using OpenQA.Selenium;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenQA.Selenium.Support.PageObjects;

namespace Teaweoitingwekeke
{
    class Page
    {

        // declare WebElements

        [FindsBy(How = How.CssSelector, Using = "body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)")]
        private IWebElement userPage;

        [FindsBy(How = How.CssSelector, Using = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input")]
        private IWebElement newUserName;

        [FindsBy(How = How.CssSelector, Using = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]")]
        private IWebElement newUserPass;

        [FindsBy(How = How.CssSelector, Using = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]")]
        private IWebElement newUserButton;

        [FindsBy(How = How.CssSelector, Using = "body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)")]
        private IWebElement loginPage;

        [FindsBy(How = How.CssSelector, Using = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input")]
        private IWebElement loginUserName;

        [FindsBy(How = How.CssSelector, Using = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]")]
        private IWebElement loginPass;

        [FindsBy(How = How.CssSelector, Using = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]")]
        private IWebElement loginButton;

        [FindsBy(How = How.CssSelector, Using = "body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b")]
        private IWebElement loginStatus;

        
        
        public void addNewUser(string username, string password)
        {
            
            userPage.Click();

            newUserName.SendKeys(username);

            newUserPass.SendKeys(password);

            newUserButton.Click();  
            
        }

        public string login(string username, string password)
        {
            
            loginPage.Click();

            loginUserName.SendKeys(username);

            loginPass.SendKeys(password);

            loginButton.Click();

            return loginStatus.Text;
                        
        }
    }
}
