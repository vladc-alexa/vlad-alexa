# Test Plan Monefy App
## Environment 
Emulated Pixel 3a API29(Android 10) - Android Virtual Device Manager
Oneplus 6T Android 9(physical device)

## Functional tests

### Settings Menu
- From Settings menu choose Accounts  and tap on plus Icon
-->expect New account screen 
- Tap on Account currency to change it
--> expect Buy Monefy Pro screen with Buy button and explained features
- type N26 for account name, input 1500 for initial balance, press on AMEX icon, press ADD button--> expect according balance
- From Settings menu choose Categories select Car and tap on a different Icon
--> expect Buy Monefy Pro screen with Buy button and explained features

### Main app dashboard

- Add 300 eur Salary Income-->check dashboard-->expect income is present in green
- Add 30 eur Car expense-->check dashboard-->expect pie chart contains epense	
- Add 30 eur House expense-->check dashboard-->expect pie chart contains epense			
- Expect Balance is 300-30-30 = 240	shown with green color	
- Add 250 eur Health expense-->check dashboard-->expect balance is -10(negative ten) with red color
- Close and reopen app --> Expect entries and values are saved 

### Balance drawer	
- Drag Balance drawer up--> expect all deposits and expense categories are present	
- Swipe drawer down again and from the dashboard add following entries:
--500 eur income
--50 eur Car expense
--50 eur House expense
Drag Balance drawer up
Expect following:
-->Deposits corresponding number is 2 and on the far right 800 eur is displayed
- tap on down arrow for deposits--> the 2 individual deposit entries are shown 
-->Car expenses corresponding number is 2 and on the far right 80 eur is displayed
- tap on down arrow for Car--> the 2 individual car expense entries are shown 
-->House expenses corresponding number is 2 and on the far right 80 eur is displayed
- tap on down arrow for House--> the 2 individual deposit entries are shown 

### Top left context menu
- select cash account - - > expect dashboard to reflect cash account balance
- select card account - - > expect dashboard to reflect card account balance
- select all accounts - - > expect dashboard to reflect all accounts balance
- choose week period - - > expect balance from current week
- choose month period - - > expect balance from current month
- choose specific date- - > expect balance from said date
### Transfer functionality
- tap transfer and select cash as source and card as destination  and input 50 eur - - > toaster text confirms transfer and the user is redirected to the dashboard

### Other functionalities
- error handling-- getting correct error messages 
- installing and un installing the app
- test with different languages 
- splitscreen with calculator app


## Non functional tests
- penentration tests
- performance(load) tests