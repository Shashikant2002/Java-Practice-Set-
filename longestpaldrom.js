// function longestPalindrome(s) {
//   //   if (s.length == 1) {
//   //     return s;
//   //   }

//   let longestStr = "";

//   for (let i = 0; i <= s.length; i++) {
//     for (let j = 0; j <= s.length; j++) {
//       let subStr = s.slice(i, j).trim();

//       if (subStr) {
//         let reverseString = subStr
//           .split("")
//           .reduce((acc, char) => char + acc, "");

//         if (subStr == reverseString) {
//           if (longestStr.length < subStr.length) {
//             longestStr = subStr;
//           }
//         }
//       }
//     }
//   }

//   return longestStr;
// }

function longestPalindrome(s) {
  let longestStr = "";

  for (let i = 0; i < s.length; i++) {
    for (let j = s.length - 1; j >= 0; j--) {
      console.log(s[i], s[j]);
      let ans = 0;
      if (s[i] == s[j]) {
        ans = 1+
      }
    }
  }

  return longestStr;
}

console.log(longestPalindrome("aa"));
// console.log(
//   longestPalindrome(
//     "anugnxshgonmqydttcvmtsoaprxnhpmpovdolbidqiyqubirkvhwppcdyeouvgedccipsvnobrccbndzjdbgxkzdbcjsjjovnhpnbkurxqfupiprpbiwqdnwaqvjbqoaqzkqgdxkfczdkznqxvupdmnyiidqpnbvgjraszbvvztpapxmomnghfaywkzlrupvjpcvascgvstqmvuveiiixjmdofdwyvhgkydrnfuojhzulhobyhtsxmcovwmamjwljioevhafdlpjpmqstguqhrhvsdvinphejfbdvrvabthpyyphyqharjvzriosrdnwmaxtgriivdqlmugtagvsoylqfwhjpmjxcysfujdvcqovxabjdbvyvembfpahvyoybdhweikcgnzrdqlzusgoobysfmlzifwjzlazuepimhbgkrfimmemhayxeqxynewcnynmgyjcwrpqnayvxoebgyjusppfpsfeonfwnbsdonucaipoafavmlrrlplnnbsaghbawooabsjndqnvruuwvllpvvhuepmqtprgktnwxmflmmbifbbsfthbeafseqrgwnwjxkkcqgbucwusjdipxuekanzwimuizqynaxrvicyzjhulqjshtsqswehnozehmbsdmacciflcgsrlyhjukpvosptmsjfteoimtewkrivdllqiotvtrubgkfcacvgqzxjmhmmqlikrtfrurltgtcreafcgisjpvasiwmhcofqkcteudgjoqqmtucnwcocsoiqtfuoazxdayricnmwcg"
//   )
// );
