from flask import Flask, render_template, request
from extractors.remoteok import extract_remoteok_jobs
from extractors.wwr import extract_wwr_jobs          #extractor 폴더에있는 remoteok와 wwr의 api를 가져옴

app = Flask("JobScrapper") #플라스크 서버를 이용하여 사이트 구축

db = {

}

@app.route("/")
def home():
  return render_template("home.html", name="kyungju")

@app.route("/search")
def search():
  keyword = request.args.get("keyword") # 키워드에 맞춰 api사이트의 검색결과를 가져옴
  if keyword in db:
    jobs = db[keyword]
  else:
    remoteok = extract_remoteok_jobs(keyword)
    wwr = extract_wwr_jobs(keyword)
    jobs = remoteok + wwr
    db[keyword] = jobs
  return render_template("search.html", keyword=keyword, 
                        jobs=jobs)
app.run("0.0.0.0")
