const colors = require("tailwindcss/colors")

module.exports = {
  purge: [
    './public/*.html',
  ],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      fontFamily: {
        arial: ['arial', 'sans-serif'],
      },
      colors: {
        googleGray: '#f2f2f2',
      },
    },
  },
  variants: {
    extend: {},
  },
  plugins: [],
}
