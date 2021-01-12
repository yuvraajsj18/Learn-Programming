// const colors = require("tailwindcss/colors")

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
    },
  },
  variants: {
    extend: {},
  },
  plugins: [],
}
