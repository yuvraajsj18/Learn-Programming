const companies= [
    {name: "Company One", category: "Finance", start: 1981, end: 2004},
    {name: "Company Two", category: "Retail", start: 1992, end: 2008},
    {name: "Company Three", category: "Auto", start: 1999, end: 2007},
    {name: "Company Four", category: "Retail", start: 1989, end: 2010},
    {name: "Company Five", category: "Technology", start: 2009, end: 2014},
    {name: "Company Six", category: "Finance", start: 1987, end: 2010},
    {name: "Company Seven", category: "Auto", start: 1986, end: 1996},
    {name: "Company Eight", category: "Technology", start: 2011, end: 2016},
    {name: "Company Nine", category: "Retail", start: 1981, end: 1989}
  ];
  
  const ages = [33, 12, 20, 16, 5, 54, 21, 44, 61, 13, 15, 45, 25, 64, 32];

// standard for loop


// for (let i = 0; i < companies.length; i++) {
//     console.log(companies[i]);
// }


// forEach

// ages.forEach((age, index, ages) => {
//     console.log(`${age} is at ${index} in ${ages}`);
// })

// get name of each company
// companies.forEach(company => console.log(company.name))

// filter

// get all companies that lasted for more than 10 years
const lastesTenYears = companies.filter(company => company.end - company.start >= 10)
// console.log(lastesTenYears);

const evenIndexCompanies = companies.filter((company, index) => !(index & 1))
// console.log(evenIndexCompanies);

// map

const agesTwicePlusIndex = ages.map((age, index) => age * 2 + index);
// console.log(agesTwicePlusIndex);

const agesThriceEven = ages
                    .map(age => age * 3)
                    .filter(age => !(age & 1))
// console.log(agesThriceEven);

// sort

// sort ages
const ascendingAges = ages.sort((a, b) => a - b);
// console.log(ascendingAges);
// console.log(ages);

const descendingAges = ages.sort((a, b) => b - a);
// console.log(descendingAges);
// console.log(ages);

// const companiesSorted = companies.sort((a, b) => a.start > b.start ? 1 : -1);
const companiesSorted = companies.sort((a, b) => a.start - b.start);
// console.log(companiesSorted);

// reduce

const agesSum = ages.reduce((sum, age) => sum + age, 0);
console.log(agesSum);