from bs4 import BeautifulSoup
import requests

def extract_jobs(term):
  url = f"https://remoteok.com/remote-{term}-jobs"
  request = requests.get(url, headers={"User-Agent": "Kimchi"})
  if request.status_code == 200:
    soup = BeautifulSoup(request.text, "html.parser")
    results = []
    jobs = soup.find("table", id="jobsboard")
    job_post = jobs.find_all(class_="company position company_and_position") # 추가
    for post in job_post:
      anchors = post.find('a')
      link = anchors['href']
      title = post.find('h2', itemprop='title')
      company = post.find('h3')
      job_data = {
      'link' : f"https://remoteok.com/{link}",
      'title': soup.title.string,
      'company' : company.get_text()
      }
      results.append(job_data)
      for result in results:
        print(result)
        print("///////////////")
  else:
    print("Can't get jobs.")

extract_jobs("rust")