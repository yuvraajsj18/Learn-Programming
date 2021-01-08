const colors = require('tailwindcss/colors')

module.exports = {
  purge: [
    "./public/*.html",
  ],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      colors: {
        'light-blue': colors.lightBlue,
        cyan: colors.cyan,
        rose: colors.rose,
        teal: colors.teal,
        emrald: colors.emrald,
      },
    },
  },
  variants: {
    extend: {},
  },
  plugins: [],
}
