import pandas as pd
import numpy as np
import seaborn as sns
import matplotlib.pyplot as plt
import plotly.express as px


base_credit = pd.read_csv('credit_risk_dataset.csv')

print(np.unique(base_credit['cb_person_default_on_file'], return_counts=True))

print(sns.countplot(x = base_credit['cb_person_default_on_file']))