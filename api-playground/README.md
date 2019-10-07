### Running Mocha Api Tests from api-playground project
## Since the api-playground project already contains tests, this is a short guideline to use them
- git clone https://github.com/BestBuy/api-playground.git
- modify package json file to pull correct dependencies - also copied package.lock.json file for reference
- change mocha package version to ^6.0.0 to be able to run the tests
- copy package.json file to api-playground project(did not copy full project to the repo)
- run npm install
- run npm audit fix if necessary
- run npm run mocha
- read test results from command line ide
