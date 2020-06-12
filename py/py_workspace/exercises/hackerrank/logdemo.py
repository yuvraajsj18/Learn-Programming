import logging

# LOG_FORMAT = '%(levelname)s - %(message)s'
logging.basicConfig(filename = "example.log", filemode = 'w', level = logging.DEBUG)

logger = logging.getLogger()
logger.debug('Debug message')
logger.info('info message')
logger.warning('warning message')

